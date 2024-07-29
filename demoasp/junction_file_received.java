package demoasp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class junction_file_received {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.edgedriver().setup();
	       WebDriver driver = new EdgeDriver();
	       driver.get("https://junction.webnerserver.com/connections/add-new-connection/");
	       String title=  driver.getTitle();
	       System.out.println(title);
	       String url=driver.getCurrentUrl();
	       System.out.println(url);
	       Thread.sleep(2000);
	       driver.manage().window().maximize();
	       //enter username and pwd
	       driver.findElement(By.xpath("//*[@id='id_login']")).sendKeys("piyush.rana@webners.com");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Ram7049@");
	       Thread.sleep(2000);
	       //login
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       Thread.sleep(2000);
	       driver.navigate().refresh();
	       //click file link
	       driver.findElement(By.xpath("//a[@id='upload_file_id']")).click();
	       Thread.sleep(2000);
	       //click on file received folder
	       driver.findElement(By.xpath("//tr[@class='even']//i[@title='Download File']")).click();
	       //click on downloaded folder
	       driver.findElement(By.xpath("//i[contains(@class,'fa fa-download fa-2x')]")).click();
	       System.out.println("file is displying in downloaded folder ");
	       Thread.sleep(5000);
	      

	}

}
