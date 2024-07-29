package demoasp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class naveen_automationlabs {
	public static void main (String [] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		Thread.sleep(200);
	    driver.get("https://naveenautomationlabs.com/opencart/");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();	
	    //click on my account
	    Thread.sleep(2000);
	    WebElement click=driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
	    click.click();
	    //click on registration 
	    driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
	    //verticle scroll bar use javaScriptExecuter
	    JavascriptExecutor jse=(JavascriptExecutor) driver;
	    Thread.sleep(2000);
	    jse.executeScript("scrollBy(0,220)");
	    
	    
	}
	
	
}
  