package practice_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class table {
		public static void main(String[] args) throws InterruptedException {
			
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Velocity\\chromedriver_win32\\chromedriver.exe");
		
WebDriver driver=new ChromeDriver();

driver.get("https://www.w3schools.com/html/html_tables.asp");
driver.manage().window().maximize();
List<WebElement> row = driver.findElements(By.xpath("(//table)[1]//tr"));
for(int a=0;a<=row.size();a++) {
List<WebElement> cell = driver.findElements(By.xpath("(//table)[1]//tr["+a+"]//td"));
for(int b=0;b<cell.size();b++) {
System.out.print(cell.get(b).getText()+"  /  ");}
System.out.println();
}

		
		}
}