package demoasp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class junction_webner
{

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	       driver.findElement(By.xpath("//*[@id='id_login']")).sendKeys("piyush.rana@webners.com");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Ram7049@");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       Thread.sleep(2000);
	    List<WebElement>linksNo=driver.findElements(By.tagName("a"));
	    System.out.println(linksNo.size());
	    System.out.println("sucessfuly test");
	    Thread.sleep(1000);
	    for (int i = 0; i < linksNo.size(); i++) {
	        System.out.println(linksNo.get(i).getText());
	        Thread.sleep(50);
	        
	    }
	}	
}	
		

		
