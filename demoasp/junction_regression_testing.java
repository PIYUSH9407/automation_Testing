package demoasp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class junction_regression_testing {
	public static void main (String[] args) throws InterruptedException, Exception {
	WebDriverManager.edgedriver().setup();	
	WebDriver driver = new EdgeDriver();
	Thread.sleep(2000);
	driver.get("https://junction.webnerserver.com/accounts/login/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//enter email id
	driver.findElement(By.xpath("//input[@id='id_login']")).sendKeys("rohit.chaudhary@webners.com");
	Thread.sleep(2000);
	//enter password
	driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("wbs@6767");
	Thread.sleep(2000);
	//click eye icon
	//driver.findElement(By.xpath("//*[@id='id_container']//div[@id='id_container']//i[contains(@class,'fa-eye-slash') and contains(@class,'toggle-password')]"));)
	//click on login
	driver.findElement(By.xpath("//*[@class=\" btn btn-primary\"]")).click();
	Thread.sleep(2000);
	//click on upload file
	driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/a[1]/i[1]")).click();
	Thread.sleep(2000);
	//drop down
	//driver.findElement(By.xpath("//*[@class=\"form-control filetype\"]")).click();
	WebElement dropdown=driver.findElement(By.xpath("//*[@class=\"form-control filetype\"]"));
	Select drop=new Select(dropdown);
	Thread.sleep(2000);
	drop.selectByIndex(1);
	Thread.sleep(2000);
	//check extract  box 
	WebElement check=driver.findElement(By.xpath("//*[@id=\"extract\"]"));
	check.click();
	Thread.sleep(2000);
	WebElement check1=driver.findElement(By.xpath("//*[@id=\"not_extract\"]"));
	check1.click();
	
	//uplaod files
	
	driver.findElement(By.xpath("//*[@id=\"clickHere\"]")).click();
	Robot rb = new Robot();
	rb.delay(2000);
	//put path to file in a clipboard
	StringSelection ss=new StringSelection("C:\\Users\\webner\\Desktop\\testing123.zip");
	//COPY FILE TO CLIPBOARD
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	//ctrl+v
	rb.keyPress(KeyEvent.VK_CONTROL);// press control key only
	rb.keyPress(KeyEvent.VK_V);// press v keyboard
	rb.delay(2000);
	
	rb.keyRelease(KeyEvent.VK_CONTROL); // release control key
	rb.keyRelease(KeyEvent.VK_V);//release v keybutton
	rb.delay(2000);
	
	//enter and relase action perform
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_V);
	rb.delay(2000);
	
	//Click action perform by doing submit 
	//driver.findElement(By.xpath("//*[@class=\"file_upload_button\"]")).click();
	driver.findElement(By.xpath("//body/div[@class='container-fluid main_base_container']/div[@class='area mb-5']/div[@id='fileupload']/div[@role='document']/div[@id='model-content']/div[@class='modal-header']/button[@aria-label='Close']/span[1]")).click();
	Thread.sleep(2000);
	
	//click sent file icon
	driver.findElement(By.xpath("//tr[@class='odd']//i[@title='Sent Files']")).click();
	//persorm share/unshare action
//	driver.findElement(By.xpath("//tbody/tr[1]/td[6]/div[1]/a[1]/i[1] ")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	
	//click on file received icon
	driver.findElement(By.xpath("//tr[@class='odd']//i[@title='Received Files']")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	//System.out.println("all test case pass successfully");
	
	
	
	
	
	// click on trash folder
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='View Trash']")).click();
	Thread.sleep(2000);
	//click on Upload & Manage Files
	driver.findElement(By.xpath("//i[contains(@class,'fa fa-upload fa-2x')]")).click();
	//click on upload files
	driver.findElement(By.xpath("//*[@class=\"nav-text btn btn-primary menu ml-1 mb-0\"]")).click();
	//select checkbox first click share file with
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class=\"overSelect\"]")).click();
	//select existing user checkbox
    List<WebElement>allcheckbox=driver.findElements(By.xpath("//*[@type=\"checkbox\" and contains(@id,'example')]"));
    System.out.println("Total number of check boxs:"+ allcheckbox.size());
    Thread.sleep(2000);
    //using simple for loop
  /*  for(int i=0;i<allcheckbox.size();i++) {
    	allcheckbox.get(i).click();
    	
    }*/
    //for each loop
    for(WebElement chek : allcheckbox) {
    	chek.click();
    }
    Thread.sleep(2000);
  
    //cross the dialog box
    driver.findElement(By.xpath("//button[@class='close']//span[@aria-hidden='true'][normalize-space()='×']")).click();
    Thread.sleep(2000);
    
    //testing on share icon
    WebElement share=driver.findElement(By.xpath("//tbody/tr[6]/td[7]/div[1]/i[1]"));
    share.click();
    Thread.sleep(2000);
    
    //click on Share File with:
    driver.findElement(By.xpath("//*[@class=\"anchor w-100 form-control \"]")).click();
    Thread.sleep(2000);
    
    //select all check box
    driver.findElement(By.xpath("//*[@id=\"select-all-checkbox\"]")).click();
    System.out.println("100% sucessfully test case pass" );
    
    Thread.sleep(7000);
    driver.close();
    
	}
	
}


    
    
    
    
    


    
    
    
   
    
	
   
    
    
	
	
	
