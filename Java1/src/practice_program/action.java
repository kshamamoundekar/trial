package practice_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1500);
		driver.manage().window().maximize();
		Thread.sleep(1500);
		WebElement log = driver.findElement(By.xpath("//a[text()='Login']"));
		Actions move=new Actions(driver);
		Thread.sleep(1500);
		move.moveToElement(log).perform();
		Thread.sleep(1500);
		
	}
	

}
