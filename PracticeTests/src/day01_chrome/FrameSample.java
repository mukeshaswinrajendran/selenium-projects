package day01_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSample {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","drivers/chrome_driver/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://letcode.in/frame");
		    Thread.sleep(4000);
		    
		    driver.switchTo().frame("firstFr");
		    WebElement fname = driver.findElement(By.name("fname"));
		    fname.sendKeys("abc");
		    
		    WebElement lname = driver.findElement(By.name("lname"));
		    lname.sendKeys("123");
		    
		    WebElement email1 = driver.findElement(By.xpath("//iframe[@src='innerframe']"));
		    
		    driver.switchTo().frame(email1);
		    WebElement element2 = driver.findElement(By.name("email"));
		    element2.sendKeys("abc@gmil.com");
		    
		    
		    
		    
		    ////iframe[@src=innerFrame']
		    
		    
		    
		    
		    
	}

}
