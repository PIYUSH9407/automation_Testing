package demoasp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class junction_test {

	public static void main(String[] args) throws Exception {
		   WebDriverManager.edgedriver().setup();
	       WebDriver driver = new EdgeDriver();
	       driver.get("https://junction.webnerserver.com/connections/add-new-connection/");
	       String title=  driver.getTitle();
	       System.out.println(title);
	       String url=driver.getCurrentUrl();
	       System.out.println(url);
	       Thread.sleep(2000);
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//*[@id='id_login']")).sendKeys("piyush.rana@webners.com");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Ram7049@");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       Thread.sleep(2000);
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//a[@id='upload_file_id']")).click();
	       JavascriptExecutor js = (JavascriptExecutor)driver;  //initilization by driver
	       Thread.sleep(2000);
	       //scroll tab in horizonatally
	       js.executeScript("document.querySelector(\"body > div:nth-child(30) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2)\").scrollLeft=300");
	       Thread.sleep(2000);
	       //download file
	     //  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[10]/div[1]/a[1]/i[1]")).click();
	      // Thread.sleep(5000);
	       //click on download folder
	       driver.findElement(By.cssSelector(".fa.fa-download.fa-2x")).click();
	     //  driver.findElement(By.xpath("//span[normalize-space()='Files Downloaded']")).click();
	       Thread.sleep(2000);
	       //scroll downloaded folder to left varifly
	      js.executeScript("document.querySelector(\"body > div:nth-child(30) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2)\").scrollLeft=300");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[9]/div[1]/a[2]/i[1]")).click();
	      //search name
	   //   driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Rohit");
	   /*   click on name
	      Thread.sleep(2000);
	      Thread.sleep(2000);
	      click on rohit name
	      driver.findElement(By.xpath("//a[@class='font-weight-bold']")).click();
	      Thread.sleep(2000);
	      esteblised connection
	     driver.findElement(By.xpath("//*[@id=\"AAKPABPSD \"]")).click();
	    /* driver.get("https://junction.webnerserver.com/connection-profile?id=AAKPABPSD");
	     Thread.sleep(2000);
	     //add conection
	     driver.findElement(By.xpath("//*[@id=\"AAKPABPSD \"]")).click();
	     Thread.sleep(5000);
	     //withdraw
	     driver.findElement(By.xpath("//button[@id='AAKPABPSD']")).click();
	     // driver.navigate().back();
	     /*  String title1=driver.getTitle();
	       System.out.println(title1);*/
	 /*      Thread.sleep(8000);
	       driver.findElement(By.xpath("//a[@id='navbarDropdownMenuLink user_name']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//a[normalize-space()='Sign Out']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//*[@id='id_login']")).sendKeys("rohit.chaudhary@webners.com");
	       driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("wbs@6767");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//a[@id='connections']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//i[contains(@class,'fas fa-user-friends')]")).click();
	       Thread.sleep(2000);Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Piyush");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//a[@class='font-weight-bold']")).click();
	       // add connection with piyush
	       driver.findElement(By.xpath("//button[@id=' CFEBMWD4X']")).click();*/
	        Thread.sleep(8000);
	       driver.close();
	     //*[@id="AAKPABPSD"]
	      
	     //i[@title='Add Connection']
	       
	       
	       
	       
		
	
	
	
	
	
	}

}
