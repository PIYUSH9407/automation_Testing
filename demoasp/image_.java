package demoasp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class image_ {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/signup");
	//	driver.findElement(By.xpath("//*[@id=\"u_0_0_wv\"]")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		/*List<WebElement> no=driver.findElements(By.tagName("img"));
		System.out.println(no.size());
		JavascriptExecutor jr=(JavascriptExecutor)driver;  //type casting
		Thread.sleep(500);
		jr.executeScript("scrollBy(0,2500)");
		Thread.sleep(1000);
		jr.executeScript("scrollBy(0,2500)");
		Thread.sleep(1000);
		jr.executeScript("scrollBy(0,-1500)");
		Thread.sleep(1000);
		jr.executeScript("scrollBy(0,-1500)");*/
		Select dropdown = new Select(driver.findElement(By.cssSelector("#day")));
		//dropdown.selectByIndex(27);
		dropdown.selectByValue("2");
		
	   

	    
		
		Thread.sleep(5000);
		driver.close();
		
		

		}

		}
