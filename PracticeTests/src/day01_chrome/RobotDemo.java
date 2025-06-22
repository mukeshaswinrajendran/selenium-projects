package day01_chrome;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDemo {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","drivers/chrome_driver/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
//		    driver.get("https://www.facebook.com/login/");
//		    Thread.sleep(2000);
//			driver.manage().window().maximize();
//			Thread.sleep(2000);
//			Robot r=new Robot();
//			
//		//Doximo
//			r.keyPress(KeyEvent.VK_D);
//			r.keyRelease(KeyEvent.VK_D);
//			
//			r.keyPress(KeyEvent.VK_O);
//			r.keyRelease(KeyEvent.VK_O);
//			
//			r.keyPress(KeyEvent.VK_X);
//			r.keyRelease(KeyEvent.VK_X);
//			
//			r.keyPress(KeyEvent.VK_TAB);
//			r.keyRelease(KeyEvent.VK_TAB);
//			
//			r.keyPress(KeyEvent.VK_A);
//			r.keyRelease(KeyEvent.VK_A);
//			
//			r.keyPress(KeyEvent.VK_B);
//			r.keyRelease(KeyEvent.VK_B);
		    
		    driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		    Thread.sleep(4000);
		    driver.manage().window().maximize();
//		    WebElement ar = driver.findElement(By.id("alertBox"));
//		    ar.click();
//		    Thread.sleep(4000);
//		    Alert ad = driver.switchTo().alert();
//		    ad.accept();
		    
		    WebElement g = driver.findElement(By.id("promptBox"));
		    g.click();
		    Thread.sleep(4000);
		    Alert H=driver.switchTo().alert();
////		    ;
//		    H.dismiss();
		    H.accept();
		    H.sendKeys("Arun");
		    Thread.sleep(4000);
		    String tx = H.getText();
		    System.out.println(tx);

		   
		    
		    
		    
		    
		    
		    
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
