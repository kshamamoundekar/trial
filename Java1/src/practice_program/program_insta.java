package practice_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class program_insta {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Velocity\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@jsaction='paste:puy29d;']")).sendKeys("instagram login");
	Thread.sleep(1500);
	driver.findElement(By.xpath("(//input[@class='gNO89b'])[1]")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("(//h3[text()='Login • Instagram'])[1]")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("(//input[@class='_2hvTZ pexuQ zyHYP'])[1]")).sendKeys("kshamamoundekar");
	Thread.sleep(1500);
	WebElement enable = driver.findElement(By.xpath("//button[@type='submit']"));
	
	if(enable.isEnabled()) {
		System.out.println("login button enable");
	}
	else {
		System.out.println("login button disenable");
	}
	
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Srikrushna@18");
	Thread.sleep(1500);
	if(enable.isEnabled()) {
		System.out.println("login button now enabled");
	}
	else {
		System.out.println("login button still disenable");
	}
	
	driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']")).click();
	Thread.sleep(2500);
	WebElement result = driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[1]"));
	String A=result.getText();
	System.out.println(A);
	
	driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	Thread.sleep(1500);	
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Krushna");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Moundekar");
	Thread.sleep(1500);
	WebElement confirm = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	if(confirm.isDisplayed()) {
		System.out.println("reconfirm email open");
	}
	else {
		System.out.println("yet to open");
	}
	
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("kshamamoundekar.km@gmail.com");
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("kshamamoundekar.km@gmail.com");
	Thread.sleep(1500);
	if(confirm.isDisplayed()) {
		System.out.println("reconfirm email is now open");
	}
	else {
		System.out.println("yet to open");
	}
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Krushna@18");
	Thread.sleep(1500);
	driver.findElement(By.name("birthday_day")).click();
	Thread.sleep(1500);	
	driver.findElement(By.xpath("(//option[@value='6'])[1]")).click();
	Thread.sleep(1500);	
	driver.findElement(By.id("month")).click();
	Thread.sleep(1500);	
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]/option[5]")).click();
	Thread.sleep(1500);	
	driver.findElement(By.name("birthday_year")).click();
	Thread.sleep(1500);	
	driver.findElement(By.xpath("//select[@id='year']/option[27]")).click();
	Thread.sleep(1500);	
	WebElement custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
	custom.click();
	Thread.sleep(1500);
//	driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
//	Thread.sleep(1500);
	WebElement display = driver.findElement(By.xpath("//input[@aria-label='Gender (optional)']"));
	Thread.sleep(1500);
	boolean d = driver.findElement(By.xpath("//div[text()='Log In']")).isEnabled();
	System.out.println(d);
	
	if(custom.isSelected()) {
		if(display.isDisplayed()) {
			System.out.println("Custom is selected and displayed");
		}
		else {
			System.out.println("not displayed");}
	}
	else {
		System.out.println("not selected");}

	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[8]/div[1]/select/option[2]")).click();
	Thread.sleep(1500);
	
	driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
	Thread.sleep(1500);
	
	
	}
	
}
