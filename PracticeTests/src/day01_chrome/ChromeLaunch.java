package day01_chrome;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","drivers/chrome_driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.coursera.org/");
//		
//		// To maximize window
//		
//		driver.manage().window().maximize();
//		
//		//get Title
//		
//		String tit = driver.getTitle();
//		
//		System.out.println(tit);
//		
//		//get URL
//		
//		String Url = driver.getCurrentUrl();
//		System.out.println(Url);
		driver.manage().window().fullscreen();	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	driver.manage().window().fullscreen();	
	
	WebElement emailuser = driver.findElement(By.name("username"));
	emailuser.sendKeys("admin");
	Thread.sleep(2000);
	
	WebElement emailpass = driver.findElement(By.xpath("//input[@name='password']"));
	emailpass.sendKeys("admin123");
	Thread.sleep(2000);
	
	WebElement emaillogin = driver.findElement(By.xpath("//button[@type='submit']"));
	emaillogin.click();
	
	
	//css selector
	
//	WebElement profilephoto = driver.findElement(By.xpath("//li[@class='oxd-userdropdown']"));
//	profilephoto.click();
//	Thread.sleep(2000);
	
//	WebElement photoclick = driver.findElement(By.cssSelector("li[class='oxd-userdropdown']"));
//	photoclick.click();
	
	WebElement modulea = driver.findElement(By.tagName("a"));
	modulea.click();
	Thread.sleep(2000);
	driver.manage().window().fullscreen();	
	
	Thread.sleep(2000);
//	WebElement freedemo = driver.findElement(By.linkText("Book a Free Demo"));
//	freedemo.click();
//	driver.manage().window().fullscreen();	
	
	WebElement contactcl = driver.findElement(By.partialLinkText("Contact"));
	contactcl.click();
	
	
	
;
	
	
	
	
	
			
	
	
	
	
		
		
	
	
	
	
	
	
	
	
	
	
	
//	driver.navigate().back();
//	Thread.sleep(2000);
//	
//	//To refresh
//	
//	driver.navigate().refresh();
	
	
	
	
	
	
	
	
	driver.navigate().forward();
	
		
		//To close currently opened tab via this 
		
		//driver.close();
		
		//driver.quit();
		
		
		
		
		
	
		
		
		
	
		
		
		
		
	}

}
