package orangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRM {
     public static void main (String []args) {
    	 WebDriverManager.edgedriver().setup();
 		 WebDriver driver=new EdgeDriver();
 		 
 		 //get methos is open on the browser
 		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 		 //this methos return of the page
 		 System.out.println(driver.getTitle());
 		 String  url= driver.getCurrentUrl();   
 		 System.out.println(url);
 		 
 		//System.out.println(driver.getPageSource()); get page source 
 		 
 		 
 		/* conditional method -access these commands trhough WebElement
 		 RETURN bollen value(true/false)
 		 isDispayed 
 		 isEnabled 
 		 isSelected */
 		 
 		 
 		 
 		 
 		 
 		 
     }

}
