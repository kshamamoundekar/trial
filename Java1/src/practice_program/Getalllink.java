package practice_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getalllink {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Velocity\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/r.php");
	Thread.sleep(1500);
	List<WebElement> A = driver.findElements(By.xpath("//a"));
	int S = A.size()-1;
//	for(int a=0;a<S;a++) {
//	System.out.println(A.get(a).getText()+"=>>"+A.get(a).getAttribute("href"));

//	}
	
	System.out.println(S);
}
}
