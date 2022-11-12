package practice_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class selectors {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Velocity\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		WebElement X = driver.findElement(By.xpath("//select[@name='birthday_day']"));		
		Select A=new Select(X);
		X.click();
		List<WebElement> opt = A.getOptions();
		A.selectByIndex(10);
		X.click();
		
		
}
}
