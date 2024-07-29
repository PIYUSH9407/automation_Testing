package demoasp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class connection_test {
	public static void main (String[]args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://junction.webnerserver.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//email id
		driver.findElement(By.xpath("//*[@id=\"id_login\"]")).sendKeys("rohit.chaudhary@webners.com");
		Thread.sleep(2000);
        //pwd
		driver.findElement(By.xpath("//*[@id=\"id_password\"]")).sendKeys("wbs@6767");
		Thread.sleep(2000);
        // submit
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		

	}
	
	

}
