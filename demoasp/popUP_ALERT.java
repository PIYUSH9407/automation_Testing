package demoasp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popUP_ALERT {
	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
	       WebDriver driver = new EdgeDriver();
	       driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	       driver.manage().window().maximize();
	       Thread.sleep(2000);
		   driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		   Alert alert  = driver.switchTo().alert();   //alert is a interface
		 /* String title= alert.getText();
		  System.out.println(title);*/
		  System.out.println(alert.getText());
		  Thread.sleep(2000);
		  
		  alert.accept();
		//  alert.dismiss();
		
		
		   Thread.sleep(8000);
	       driver.close();
	}

}
