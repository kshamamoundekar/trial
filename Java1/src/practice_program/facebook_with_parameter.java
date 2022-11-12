package practice_program;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_with_parameter {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Velocity\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("facebook login");
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//input[@value='Google Search'])[1]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		Thread.sleep(1500);

		
//		======================================================
		
		File X=new File("C:\\Users\\Admin\\Desktop\\Velocity\\login.xlsx");
		
		Sheet book = WorkbookFactory.create(X).getSheet("Sheet1");
		
		
		for(int r=1;r<=book.getLastRowNum();r++) {
			
		String cell1 = book.getRow(r).getCell(0).getStringCellValue();
		String cell2 = book.getRow(r).getCell(1).getStringCellValue();
			
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(cell1);
		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(cell2);
		Thread.sleep(1500);

		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("(//span[contains(@class,'f7rl1if4 ')])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//span[@dir='auto'])[7]")).click();
		Thread.sleep(1500);

		
		
		}
		
		
	
		
				
//		=======================================================
		
		
	
	}

}
