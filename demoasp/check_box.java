package demoasp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class check_box {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		Thread.sleep(2000);
		driver.navigate().to("https://demoqa.com/checkbox");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement check =driver.findElement(By.xpath("//span[@class='rct-title']"));
		check.click();
		check.getText();
		Thread.sleep(2000);
		System.out.println(check.getText());
		System.out.println("working");
		
	

	}

}
