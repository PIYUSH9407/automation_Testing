package orangeHRM;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class condition_method {
   public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	/* conditional method -access these commands trhough WebElement
	 RETURN bollen value(true/false)
	 isDispayed 
	 isEnabled 
	 isSelected */
	
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@class='ico-register']")).click();
	
	//isDisplayed
	WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	
	System.out.println("Display status of logo: "+logo.isDisplayed());
    WebElement radio=driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
    radio.click();
  
    System.out.println("radio button is selected: "+radio.isSelected());
	
	
	
}

}
