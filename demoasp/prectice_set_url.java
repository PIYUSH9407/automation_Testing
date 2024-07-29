package demoasp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class prectice_set_url {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	js.executeScript("scrollBy(0,900)");
	System.out.println("working");
	driver.findElement(By.xpath("//label[@for='gender-radio-1']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@for=\"hobbies-checkbox-1\"]")).click();	
	List<WebElement>all_links=driver.findElements(By.tagName("a"));
    System.out.println("total no. of links is :"+ all_links.size());
    for(int i=0;i<=all_links.size();i++) {
    	System.out.println(all_links.get(i).getText());
	
	//label[@for='gender-radio-1']
	
	
	
	Thread.sleep(9000);
	 driver.close();
	
	}

}}
