package demoasp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrmlive {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("admin123");
		Thread.sleep(2000);
		
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("12222222");
		login.click();
		Thread.sleep(2000);Thread.sleep(2000);
		//scroll up and down
		JavascriptExecutor jr=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		jr.executeScript("scrollBy(0,500)");
		Thread.sleep(2000);
		jr.executeScript("scrollBy(0,-200)");
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.close();
	}

}
