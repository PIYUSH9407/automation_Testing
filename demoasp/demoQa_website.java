package demoasp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoQa_website {
	public static void main (String[] args) throws InterruptedException, AWTException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		JavascriptExecutor jse= (JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("scrollBy(0,200)");
		Thread.sleep(200);
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("java");
	
		Thread.sleep(2000);
		// select the radio button 
		driver.findElement(By.xpath("//*[@for=\"gender-radio-2\"]")).click();
		Thread.sleep(2000);
	
		List<WebElement> checkboxfields = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		System.out.println("total number of check box are :"+ checkboxfields.size());
	
		/*	for(WebElement checkboxField :checkboxfields )
        {
			checkboxField.click();
			
		}
		for(int i=0;i<3;i++) {
			checkboxfields.get(i).click();	
		}*/
		//upload the file 
		// use robo clss to uplaod the files
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"uploadPicture\"]")).click();
		Thread.sleep(200);
		Robot rb = new Robot();
		rb.delay(200);
		StringSelection ss = new StringSelection("C:\\Users\\webner\\Desktop\\sender.zip");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.delay(200);
		//ctrol+v
		rb.keyPress(KeyEvent.VK_CONTROL);   //press ctrl
		rb.keyPress(KeyEvent.VK_V);         //press v
		rb.delay(200);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);   //relese the button
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(200);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(200);
	
	}
}
		
		
	
	
	

