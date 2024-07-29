package demoasp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class junction_price {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://junction.webnerserver.com/pricing/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//user name
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("name_name _name_nasme ");
		Thread.sleep(2000);
		//email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ranapiyush@gmail.com");
		Thread.sleep(2000);
		//company name
		driver.findElement(By.xpath("//input[@id='companyName']")).sendKeys("webner private limted company mohali");
		Thread.sleep(2000);
		//subject
		driver.findElement(By.xpath("//input[@id='subject']")).sendKeys("my testing subject");
		Thread.sleep(2000);
		//message
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("my testing message_message ");
		Thread.sleep(2000);
		//click proceed
		driver.findElement(By.xpath("//*[@id=\"btnSubmit\"]")).click();
		Thread.sleep(8000);
		driver.close();
	}

}
