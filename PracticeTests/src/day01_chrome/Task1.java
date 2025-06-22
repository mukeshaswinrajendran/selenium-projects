package day01_chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chrome_driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(4000);
	    
//	    WebElement btlogin = driver.findElement(By.name("login"));
//	    boolean displayed = btlogin.isDisplayed();
//	    
//	    System.out.println(displayed);
//	    
//	    boolean enabled = btlogin.isEnabled();
//	    System.out.println(enabled);
//	    
	    
	    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	    
	    WebElement select1 = driver.findElement(By.xpath("(//input[@id='sex'])[1]"));
	    
	    select1.click();
	    boolean selected = select1.isSelected();
	    System.out.println(selected);    
	    
//	    
//	    
	}

}
