package demoasp;
import java.util.List;
import org.openqa.selenium.By;              
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo_test {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		driver.manage().window().maximize();
//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("scrollBy(0,450)");
//		jse.executeScript("scrollBy(0,200)");
//		Thread.sleep(2000);
//		WebElement click = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
//		click.click();
//		Thread.sleep(2000);
//		
//		List<WebElement>checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		
//		System.out.println("total no.of checkbox: " + checkboxes.size());
//		
//		Thread.sleep(5000);
//      useing for loop
//		for(int i=0; i<checkboxes.size(); i++) {
//			checkboxes.get(0).click();
//			}
		
         WebElement country=driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
         //country.click();	  
         Thread.sleep(2000);
         Select dropdown = new Select(country);
         Thread.sleep(2000);
//         dropdown.selectByVisibleText(NCR);
         dropdown.selectByIndex(1);
         
         
		
		
		
		Thread.sleep(5000);
		driver.close();
	}
	
	
}
		
		
		
		
		
		


