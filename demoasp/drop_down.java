package demoasp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drop_down {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/create%20new%20account");
		driver.manage().window().maximize();
		Thread.sleep(200);
		driver.findElement(By.xpath("//a[@role='button'][normalize-space()='Sign Up']")).click();
		Thread.sleep(2000);
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		Thread.sleep(2000);
	   // jse.executeScript("ScrollBy(0,500)");
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='day']"));
		Select drop = new Select(dropdown);  
		Thread.sleep(2000);
		drop.selectByVisibleText("28"); 
		
		Thread.sleep(2000);
		WebElement radio1 =driver.findElement(By.xpath("//*[@id=\"u_0_4_uk\"]"));
		Thread.sleep(2000);
		radio1.click();
		System.out.println(radio1.isSelected());
		
		
		Thread.sleep(8000);
		driver.close();

	}

}
