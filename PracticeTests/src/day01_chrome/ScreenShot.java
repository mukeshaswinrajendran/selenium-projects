package day01_chrome;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver","drivers/chrome_driver/chromedriver.exe");
			    WebDriver driver=new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.get("https://www.facebook.com/login/");
			    Thread.sleep(4000);
			    
			    //type casting(downcast)
			    
			    TakesScreenshot ts=(TakesScreenshot)driver;
			    File sc1 = ts.getScreenshotAs(OutputType.FILE);
			    File dest=new File("D:\\selenium-projects\\PracticeTests\\ScreenShot\\facebooklogin1.jpeg");
			    
			    FileUtils.copyFile(sc1, dest);       
			    
			    
			    
			       
			    
			    

			     
			    
			    
			    
			    

	}

}
