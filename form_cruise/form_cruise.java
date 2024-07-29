package form_cruise;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class form_cruise {
	public static void main (String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // pageload timeout    
				
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);      
		
		// Implicit Wait for 20 seconds  
		driver.get("https://formcruise.webnerserver.com/");
		
		//maximize the page
		driver.manage().window().maximize();
		String name="P&C Insurance Agency CRM with ACORD Forms";
		String actual="";
		actual=driver.getTitle();
		System.out.println("title name: "+ actual);
		if(name.equals(actual)) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case fail");
		}
		
		// username, pwd, submit
		driver.findElement(By.xpath("//*[@id=\"signin_active\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"UserName\"]")).sendKeys("piyush.rana@webners.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Wbs@@6767");
		driver.findElement(By.xpath("//input[@id='submitbtn']")).click();
		 
		//click on CRM*****
		Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("//span[normalize-space()='CRM']"));
		drop.click();
		drop.click();
	
		//click on the lead
		driver.findElement(By.xpath("//span[normalize-space()='Leads']")).click();
		
		//add the lead 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@title='Add Lead']")).click();
		System.out.println("add lead is click-able");
		
		//lead information
	//	driver.findElement(By.xpath("//body/div[@id='AddLeadModal']/div[@class='modal-dialog']/div[@class='modal-content']/form[@id='LeadForm']/div[@class='modal-body']/div[@class='form-row mx-auto mb-1']/div[@class='form-group col-md-6 ']/input[1]")).sendKeys("piyush");
	    driver.findElement(By.cssSelector("body > div:nth-child(10) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > input:nth-child(2)")).sendKeys("piyuhs");
		WebElement	dropdown=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/select[1]"));
	    Select dropd=new Select(dropdown);
	    dropd.selectByValue("Male");  //select Gender
	    
	    driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/input[1]")).sendKeys("00071");
	    System.out.println("forward");
	    
		System.out.println("backword");
		Thread.sleep(14000);
		//driver.close();
		
		
	}
}
