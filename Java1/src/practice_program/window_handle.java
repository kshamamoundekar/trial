package practice_program;

	import java.util.ArrayList;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class window_handle {
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Admin\\\\Desktop\\\\Velocity\\\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://skpatro.github.io/demo/links/ "); // main page
			
			driver.findElement(By.xpath("//input[@name='NewTab']")).click();// main page element action perform
			
			Set<String> ids = driver.getWindowHandles(); // to get adress of differnt tabs
			
			ArrayList<String> a1 = new ArrayList<String>(ids); // object of arraylist
			
			String cwid = a1.get(1);// to get adreess of child browser
		
			driver.switchTo().window(cwid);
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
			
			System.out.println(cwid);
			
			driver.switchTo().window(a1.get(0));
			
			driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
			
			
			
			
			
			
			
			
			
		}
		
		
		
	
	
}
