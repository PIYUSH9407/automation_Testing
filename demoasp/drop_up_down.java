package demoasp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class drop_up_down {

	public static void main(String[] args) throws Exception {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();  //webdriver is a interface so wecan not maake object of this//
	//WebDriver driver=new WebDriver();  Not we Do like this;
	driver.get("https://www.javatpoint.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	//Scroll down this is the syntax of 
	JavascriptExecutor jr=(JavascriptExecutor)driver;
	Thread.sleep(2000);
	jr.executeScript("window.scrollBy(0,900)");
	Thread.sleep(2000);
	Thread.sleep(2000);
	driver.close();
	 
	

	}

}
