package demoasp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class title_number {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://junction.webnerserver.com/accounts/login/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("piyush.rana@webners.com");
        System.out.println("working email");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Wbs@@6767");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        /*WebElement logo=driver.findElement(By.xpath("//img[@class='logo1']"));
		System.out.println(logo);*/
        //find all the links present in the landing page
        List<WebElement>all_links=driver.findElements(By.tagName("a"));
        System.out.println("total no. of links is :"+ all_links.size());
       /* for(int i=0;i<=all_links.size();i++) {
        	System.out.println(all_links.get(i).getText());
        */	
     
		
		}
		
		

}
