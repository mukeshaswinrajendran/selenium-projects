package day01_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","drivers/chrome_driver/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://toolsqa.com/");
		    Thread.sleep(4000);
		    
		    JavascriptExecutor ps=(JavascriptExecutor)driver;
		    
		    WebElement scrolldown = driver.findElement(By.xpath("//div[text()='Raveesh Rai – India (Exp- 8Yrs)']"));
		    ps.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		    Thread.sleep(4000);

		    
		    WebElement scrollup = driver.findElement(By.xpath("//div[text()='Selenium Online Trainings']"));
		    ps.executeScript("arguments[0].scrollIntoView(false)", scrollup);
		    
		    
		    
	}

}
