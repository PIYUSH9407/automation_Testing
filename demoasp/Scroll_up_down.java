package demoasp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll_up_down {

	public static void main(String[] args) throws Exception {
	WebDriverManager.edgedriver().setup();
    WebDriver driver=new EdgeDriver();
    driver.navigate().to("https://www.javatpoint.com/");
    driver.manage().window().maximize();  
    Thread.sleep(2000);
    JavascriptExecutor jse = (JavascriptExecutor) driver;
   // jse.executeScript(window.scrollBy(0,400));
    Thread.sleep(2000);
    jse.executeScript("scrollBy(0, 500)");  
    jse.executeScript("scrollBy(0, 500)");  
    Thread.sleep(2000);
    jse.executeScript("scrollBy(0, 500)");  
    Thread.sleep(2000);
    jse.executeScript("scrollBy(0, -1000)");   
    Thread.sleep(2000);
    jse.executeScript("scrollBy(0, -500)");  
    Thread.sleep(8000);
    driver.close();

	}

}
