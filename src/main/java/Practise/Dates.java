package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.platform.win32.WinBase.SYSTEM_INFO.PI.ByReference;

public class Dates {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
System.setProperty("WebDriver.chrome.Driver", "E:\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='travel_date']")).click();
		
		
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).getText().contains("June"))
			
		{	
		
			driver.findElement(By.xpath("//table[@class=' table-condensed']//th[@class='next']")).click();
			
			Thread.sleep(5000);
			
		}
		
		List<WebElement> p=driver.findElements(By.xpath("//td[@class='day']"));
		
		for(int i=0;i<p.size();i++)
			
		{
			
		
		String n=driver.findElements(By.xpath("//td[@class='day']")).get(i).getText();
		Thread.sleep(2000);
		
		if(n.equalsIgnoreCase("29"))
			
		{
		
		
		driver.findElements(By.xpath("//td[@class='day']")).get(i).click();
		
		Thread.sleep(3000);
		
		break;
		
		
		
		
		}
		
		
		}
		
		
		
		
	}

	}
