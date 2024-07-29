package demoasp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class upload_file {

	public static void main(String[] args) throws Exception {
		 WebDriverManager.edgedriver().setup();
	       WebDriver driver = new EdgeDriver();
	       driver.get("https://www.foundit.in/"); 
	       // Provide Path Of The File
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();
	       Thread.sleep(2000);
	       
	       //this sendkey method use in when html code write in (type=files)
	       driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\webner\\Documents\\python book\\learn-python3-the-hard-way-nov-15-2018.pdf");
	       Thread.sleep(5000);
	       System.out.println("file is uploaded successfully");
	    driver.close();
	       
	

	}

    }
