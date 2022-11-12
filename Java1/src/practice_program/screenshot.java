
package practice_program;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Velocity\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://trade.angelone.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		File X= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String A = RandomString.make();
		File Y=new File("C:\\Users\\Admin\\Desktop\\Velocity\\Test"+A+".jpg");
		
		FileHandler.copy(X, Y);
		
		
	}

}
