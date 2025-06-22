package day01_chrome;

	import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	
	public class ActionsMouse {


		public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","drivers/chrome_driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
//			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
//			
//			WebElement mouseOver = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
//			Actions act=new Actions(driver);
//			
//			act.moveToElement(mouseOver).perform();
			
//			WebElement yourAccount = driver.findElement(By.xpath("//span[text()='Your Account']"));
//			yourAccount.click();
			
			
//			driver.get("https://www.google.co.in/");
//			Thread.sleep(2000);
//			WebElement gmailLogin = driver.findElement(By.xpath("//a[text()='Gmail']"));
//			Actions doubleclick=new Actions(driver);
//			doubleclick.Click(gmailLogin).perform();
//			
			
//			driver.get("https://demo.guru99.com/test/drag_drop.html");
//			Thread.sleep(2000);
//			WebElement sou = driver.findElement(By.id("credit2"));
//			WebElement des = driver.findElement(By.id("Bank"));
//			
//			Actions dragDrop=new Actions(driver);
//			dragDrop.dragAndDrop(sou, des).perform();
//			Thread.sleep(2000);
//			
//			WebElement souu = driver.findElement(By.id("fourth"));
//			WebElement dess = driver.findElement(By.id("amt7"));
//			Actions dragDropp=new Actions(driver);
//			dragDropp.dragAndDrop(souu, dess).perform();
//			
			driver.get("https://www.facebook.com/login/");
			Thread.sleep(2000);
			WebElement logIn = driver.findElement(By.id("email"));
			Actions act=new Actions(driver);
			act.keyDown(Keys.SHIFT).sendKeys(logIn, "welcome").keyUp(Keys.SHIFT).build().perform();
			 
			
		}			

}
