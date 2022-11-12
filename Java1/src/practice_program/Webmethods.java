package practice_program;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Webmethods {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Velocity\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"sobe_d_b_2_1\"]/a/div[1]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//div[@class='a-section octopus-pc-item-hue-shield octopus-pc-item-image-background-v3'])[3]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[@id='submit.add-to-cart']")).click();
		Thread.sleep(1500);		
		File X = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(1500);	
		String xyz=RandomString.make();
		File Y=new File("C:\\Users\\Admin\\Desktop\\Velocity\\src\\xyz"+xyz+".jpg");
		Thread.sleep(1500);	
		FileHandler.copy(X,Y);
		
		
		
//		Thread.sleep(1500);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.ByPartialLinkText(
//				(//a[text()='Sign up now'])[1]
		
		
				
	}

	private static void FileHandler(File x, File y) {
		// TODO Auto-generated method stub
		
	}

}
