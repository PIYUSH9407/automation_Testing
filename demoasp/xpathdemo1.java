package demoasp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpathdemo1 {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		 WebDriverManager.edgedriver().setup();
	       WebDriver driver = new EdgeDriver();
	       driver.get("https://www.mycarhelpline.com/");
	       driver.manage().window().maximize();   
	     
	       System.out.println("url launch");
	       driver.manage().window().maximize();
	       //  driver.close();
	       //  driver.findElement(By.xpath("//*[@id=\"login1\" and @name=\"login\"]")).sendKeys("123");
	  
	       driver.findElement(By.xpath("//div[@id=\"bluemenu\"]/child::ul[1]/child::li[5]/child::a[1]")).click();
		
	
}
}