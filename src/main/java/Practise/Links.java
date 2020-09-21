package Practise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.Driver", "E:\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		
		
		WebElement footreader=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		
		System.out.println(footreader.findElements(By.tagName("a")).size());
		
		
		
		
		WebElement colreader=footreader.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		
		
		
		int c=colreader.findElements(By.tagName("a")).size();
		
		System.out.println(c);
		
		for(int d=1;d<c;d++)
			
		{
		
		
		String innercount=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
		
		colreader.findElements(By.tagName("a")).get(d).sendKeys(innercount);
		
	Thread.sleep(4000);
		
		
		}
		
		
		
		String parentwindow=driver.getWindowHandle();
		
		System.out.println(driver.switchTo().window(parentwindow).getTitle());
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String> itr=windows.iterator();
		
		while(itr.hasNext())
			
			{
		

			String childwindow=itr.next();
			
			if(!parentwindow.equals(childwindow))
				
			{	
				
				
		String actual=	driver.switchTo().window(childwindow).getTitle();	
				
				System.out.println(actual);
			
			Thread.sleep(2000);
			
		}
		
			
			}
		
		
		driver.switchTo().window(parentwindow);
		
		
	
		/*
		
	      Set<String>   abc=driver.getWindowHandles();
	      
	     
	      Iterator<String> itr1=abc.iterator();
	      
	      while(itr1.hasNext())
	      {
	      
	         driver.switchTo().window(itr1.next());
	         
	         System.out.println(driver.getTitle());
	         
	      
		
		
		
	      }
		
		
		*/
		
		
		
		
			
			}


}
