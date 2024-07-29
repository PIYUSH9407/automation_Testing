package demoasp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class name_organization_junction {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://junction.webnerserver.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='id_login']")).sendKeys("piyush.rana@webners.com");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Ram7049@");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    //add new connection
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//i[contains(@class,'fas fa-user-friends')]")).click();
	    //click on by cin no.
	    driver.findElement(By.xpath("//a[@id='searchby_id_modal']")).click();
	    Thread.sleep(2000);  
	    //enter cin no
	    WebElement cin=driver.findElement(By.xpath("//*[@id=\"id_input\"]"));
	    cin.click();
	    cin.sendKeys("CEBPB939P");
	    //click on search
	    WebElement search =driver.findElement(By.xpath("//*[@id=\"id_search\"]"));
	    search.click();
	    Thread.sleep(5000);
	    cin.clear();
	    Thread.sleep(1000);
	    //enter cin no
	    WebElement cinn=driver.findElement(By.xpath("//*[@id=\"id_input\"]"));
	    cinn.click();
	    cinn.sendKeys("AR2UASE6M");
	    //click on search
	    search.click();
	    //driver.findElement(By.xpath("//*[@id=\"id_search\"]")).click();
	    Thread.sleep(5000); 
	    driver.navigate().back();
        
	    /*cin.clear();
	    Thread.sleep(2000);
	    WebElement cinn=driver.findElement(By.xpath("//a[@id='searchby_id_modal']"));
	    cinn.sendKeys("AR2UASE6M");
	    driver.findElement(By.xpath("//*[@id=\"id_search\"]")).click();
	    Thread.sleep(5000);
	    cinn.clear();*/
	 //  search the name 
	    driver.findElement(By.xpath("//i[contains(@class,'fas fa-user-friends')]")).click();
	    WebElement ser_enter= driver.findElement(By.xpath("//input[@type='search']"));
	    ser_enter.click();
	  
	    ser_enter.sendKeys("Webner");
	    Thread.sleep(5000);
	    ser_enter.clear();
	    ser_enter.sendKeys("Abc");
	    Thread.sleep(5000);
	    ser_enter.clear();
	    ser_enter.sendKeys("Testing@123");
	    Thread.sleep(15000);
	    driver.close();
	   
	    
	    
	    
	}
	
}


	   
