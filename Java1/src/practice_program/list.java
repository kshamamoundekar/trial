package practice_program;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class list {

//	Webdriver = get,navigate(to,back,forward,refresh),switchto,manage,geturl,gettitle
//	Webelements
//	locators=id,name,tagname,classname,css,xpath
//	Xpath = (relative=attribute,contains,index,linktext,partiallinktext ),absolute;
//	Select class
//	deselect/multiselectable list
//	Screenshot
//	parameterization
//	windowhandles
//	iframes
//	Popup
//	Get all link from a page
//	Web table
//	action class - cursor movement
//	action class - drag n drop
//	wait - implicit and explicit
//	fluent wait
//	scrollup and down
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Velocity\\chromedriver_win32\\chromedriver.exe");
	
	Thread.sleep(1500);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/r.php");
	
	//Custom button
	WebElement M = driver.findElement(By.xpath("//label[text()='Custom']"));
	//select 
	WebElement A = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
//	(//option[@value='1'])[3]
//	(//option[@value='2'])[3]
//	(//option[@value='3'])[3]
	//send keys
	WebElement X = driver.findElement(By.xpath("//input[@name='custom_gender']"));
	M.click();
	A.click();
	A.findElement(By.xpath("(//option[@value='6'])[3]")).click();
	Thread.sleep(2000);
	{boolean l = A.isSelected();
	if(l==true) {
//		M.click();
//		A.clear();
//		A.findElement(By.xpath("(//option[@value='2'])[3]")).click();
//		X.clear();
		X.sendKeys("We");
		Thread.sleep(2000);
	}
	else {
		M.click();
		A.findElement(By.xpath("(//option[@value='1'])[3]")).click();
		X.sendKeys("Female");
		}}
	
	
	
	
}
}