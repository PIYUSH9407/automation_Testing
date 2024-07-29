package demoasp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SIZE_ {

	public static void main(String[] args) throws Exception {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> size1 = driver.findElements(By.tagName("a"));
		System.out.println("total no. of links "+ size1.size() );
		Thread.sleep(2000);
		for(int i=0;i<=size1.size();i++) {
			System.out.println(size1.get(i).getText());
			
		}
		

	}

}
