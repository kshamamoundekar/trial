package practice_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class practice_driverprog_flipkart  {
	 
public static void main(String[] args) throws InterruptedException  {
												
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Velocity\\chromedriver_win32\\chromedriver.exe");
//	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Desktop\\Velocity\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	
	WebDriver driver=new ChromeDriver();
//	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.google.com/");
	Thread.sleep(1500);
	
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("flipkart login");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@role='button']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//h3[text()='Flipkart']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7843074869");
	Thread.sleep(1500);
	driver.manage().window().maximize();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Srikrushna@1");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@class='_3704LK']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("(//img[@class='_2OHU_q aA9eLq'])[1]")).click();
	Thread.sleep(1500);
	
	
	
	
	
		
}
}
