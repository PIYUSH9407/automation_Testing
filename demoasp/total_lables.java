package demoasp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class total_lables {
	public static void main (String[] arg) throws Exception {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://junction.webnerserver.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#signin")).click();
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		System.out.println("total number of links "+ elements.size());
		Thread.sleep(2000);
		for(int i=0;i<=elements.size();i++) {
			System.out.println(elements.get(i).getText());
		}
		
		Thread.sleep(5000);
		driver.close();
	}
	

}
