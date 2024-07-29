package demoasp;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class junction_registration_page {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://junction.webnerserver.com/accounts/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//enter email id
		driver.findElement(By.xpath("//input[@id='id_login']")).sendKeys("piyusr@mailinator.com");
		Thread.sleep(2000);
		//enter password
		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Wbs@@6767");
		Thread.sleep(2000);
		//click eye icon
		//driver.findElement(By.xpath("//*[@id='id_container']//div[@id='id_container']//i[contains(@class,'fa-eye-slash') and contains(@class,'toggle-password')]"));)
		//click on login
		driver.findElement(By.xpath("//*[@class=\" btn btn-primary\"]")).click();
		//How would you use WinsurTech Junction?
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[normalize-space()='All of these (Paid Subscription required)']//input[@id='optionsRadios']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("piyush rana");
		Thread.sleep(500);
		//select type
		Select dropdown= new Select(driver.findElement(By.id("Type")));
		Thread.sleep(500);
		dropdown.selectByIndex(1);
		//organization name
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='Organization']")).sendKeys("Webners private limited company");
		//official email id
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='official_email']")).sendKeys("piyush.rana@webners.com");
		//address
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='inputAddress']")).sendKeys("mohali 67 sector");
		//zipcode
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='inputZip']")).sendKeys("123456789");
		Thread.sleep(1500);
//      The 'Select' class in Selenium WebDriver is used for selecting 
//		and deselecting option in a dropdown.
		
		Select country=new Select(driver.findElement(By.id("Country")));
		Thread.sleep(1500);
        //select country
		country.selectByVisibleText("India");
		Thread.sleep(1500);
		//select state
		Select state=new Select(driver.findElement(By.id("state")));
		state.selectByVisibleText("Himachal Pradesh");
		//select city
		Thread.sleep(1500);
		Select city =new Select(driver.findElement(By.id("city")));
		city.selectByVisibleText("Mandi");
		Thread.sleep(1000);
	    //driver.findElement(By.xpath("//i[@title='Upload Logo']")).sendKeys("C:\\Users\\webner\\Pictures\\tibet-kailash-monte-sacro-mountain.jpg");
		
		//*[@for="imageUpload"]
		
		//use robot class method is use when (type =file) is missing
		//some time click action is not work so we use java script executer method
		driver.findElement(By.xpath("//input[@id='uploadPicture']")).click();
		Robot rb = new Robot();
		rb.delay(2000);
		//put path to file in a clipboard
		StringSelection ss  = new StringSelection("C:\\Users\\webner\\Pictures\\avtar.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//ctrl+ V
		rb.keyPress(KeyEvent.VK_CONTROL); //PRESS ON CONTROL KEY ON YOUR KEYBOARD
		rb.keyPress(KeyEvent.VK_V);  //press on ctrl+v action
		rb.delay(2000);

		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);

		
		//enter and release
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(2000);
		Thread.sleep(2000);
		//perform click action
		driver.findElement(By.xpath("//*[@id='submit_btn']")).click();

		Thread.sleep(5000);
		// connection page 
		
		
	    System.out.println("form is sucessflly submit: ");
		
		
	//	driver.close();

	}

}
