package Practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class javascript1 {

	public static void main(String[] args) throws Throwable {
		

		 System.setProperty("WebDriver.chrome.Driver", "E:\\chromedriver.exe");
			
		   WebDriver driver=new ChromeDriver();
		   		   
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		driver.get("https://www.seleniumeasy.com/test/");
		
		driver.findElement(By.xpath("//a[@id='at-cv-lightbox-close']")).click();
		
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,5000)");		
		
		driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
	
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@class='list-group-item'][contains(text(),'Javascript Alerts')]")).click();
		
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		
		driver.switchTo().alert().accept();
		
	
		
		js.executeScript("window.scrollBy(0,5000)");
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]")).click();
		
		driver.switchTo().alert().accept();
		
		js.executeScript("window.scrollBy(0,800)");
			
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]")).click();
		
		driver.switchTo().alert().dismiss();
		
		
	//	Actions act = new Actions(driver);
		
      //  act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform();
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL + "t");
	
		
		
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		
		driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("pushpak");
		
		driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();

		Thread.sleep(3000);
		
	    String a=driver.findElement(By.xpath("//span[@id='display']")).getText();
	    
	    
		
		if(a.equals("pushpak"))
			
		{
			
	     System.out.println("The message is displayed correctly :  " + a);
	     
	    }
		
		else
			
		{
		
		System.out.println("The message is wrongly diplayed");
		}
		
		
		js.executeScript("window.scrollBy(0,1000)");
		
		
		driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("3");
		
		driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("2");
		
		driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click();
		
		Thread.sleep(2000);
		
		String x=driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();
		
		if(x.equals("5"))
		{
		
		
		System.out.println("The output of sum is :" + x);
		}
		
		else
			
		{
		
			System.out.println("the output is not displayed correctly");
		}
		
		
				
	}		
}
