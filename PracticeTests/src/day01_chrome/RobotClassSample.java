package day01_chrome;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassSample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","drivers/chrome_driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
	    Thread.sleep(4000);
	    
//	   driver.findElement(By.id("alertBox")).click();
//	    Thread.sleep(4000);
//
//	   
//	   Alert al = driver.switchTo().alert();
//	   al.accept();
//	   
//	    driver.findElement(By.id("confirmBox")).click();
//	    
//	    Alert at = driver.switchTo().alert();
//	    at.dismiss();
//	    
	    driver.findElement(By.id("promptBox")).click();
	    
	    Alert az = driver.switchTo().alert();
	    az.sendKeys("it is good");
	    az.accept();
	    
	    System.out.println(az.getText());  

	}

}
