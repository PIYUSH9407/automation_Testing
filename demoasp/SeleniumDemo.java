package demoasp;

import org.openqa.selenium.By;import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {
    public static void main(String[] args) throws Exception {
       WebDriverManager.edgedriver().setup();
       WebDriver driver = new EdgeDriver();
       driver.get("https://www.gmail.com/");
       driver.manage().window().maximize();
       
        
      /*  System.out.println("working");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type=\"email\"]")).sendKeys("piyush.rana@webners.com");
        System.out.println("working email");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
        System.out.println("click");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@name=\"Passwd\"]")).sendKeys("Ram7049@");
        Thread.sleep(2000);
      // driver.findElement(By.xpath("/html/head/script[8]")).click();*/
       
       
     /*  driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("boat 141 airdopes");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
       
       System.out.println("done");
      // driver.findElements("a")*/
       //username
      driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("piyush.rana@webners.com");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();

       Thread.sleep(2000);
       Thread.sleep(2000);
       //passward
       driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Ram7049@");
       Thread.sleep(2000);
       //next
       driver.findElement(By.xpath("//span[normalize-space()='Next']")).click();
       System.out.println("passward sucesfully launch");
       Thread.sleep(2000);
       Thread.sleep(2000); 
       Thread.sleep(2000);  
       Thread.sleep(2000);  
       Thread.sleep(2000);  
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//div[@aria-label='Chat, 0 unread messages']")).click();
       System.out.println("sucessfuly luanch chat in gamil");
       Thread.sleep(2000);  
       Thread.sleep(2000); Thread.sleep(2000);  
       Thread.sleep(2000);  Thread.sleep(2000);  
       Thread.sleep(2000);   
        Thread.sleep(2000);  
       driver.findElement(By.xpath("//div[@id=':9h']//span[contains(text(),'Fwd: Chat with Harsh Johar \"one test case is that ')]")).click();
       System.out.println("complete");
       
    
       
    }
}