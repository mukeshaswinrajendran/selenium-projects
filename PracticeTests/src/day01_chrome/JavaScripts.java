package day01_chrome;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class JavaScripts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chrome_driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/login/");
	    Thread.sleep(4000);
	    
	    //downcast
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    WebElement usrname = driver.findElement(By.id("email"));
	    js.executeScript("arguments[0].setAttribute('value','acs@gmail.com')", usrname);
	    @Nullable
		Object ob = js.executeScript("return arguments[0].getAttribute('value')", usrname);
	    System.out.println(ob);
	    
	    WebElement paswrd = driver.findElement(By.id("pass"));
	    js.executeScript("arguments[0].setAttributes('value','hellllllo')", paswrd);
	    
	    @Nullable
		Object ex = js.executeScript("return arguments[0].getAttribute('value')", paswrd);
	    System.err.println(ex);
	    
	    
	    
	   
	    
	    
	    

	}

}
