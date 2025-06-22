package day02_edge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeLaunch {
	
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","drivers/edge_driver/msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
//		driver.get("https://www.microsoft.com");
		
		// To maximize window
		
//		driver.manage().window().maximize();
//		
//		//get Title
//		
//		String tit = driver.getTitle();
//		
//		System.out.println(tit);
		
		//get URL
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		
		driver.navigate().to("https://chatgpt.com/");
		driver.manage().window().maximize();

		
		//To close currently opened tab via this 
		
		//driver.close();
		
		//driver.quit();
		
		
}
}

		

