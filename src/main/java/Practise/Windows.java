package Practise;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("WebDriver.Chrome.driver", "E:\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		
		driver.get("http://the-internet.herokuapp.com/");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		
		String parentwindow=driver.getWindowHandle();
		
		System.out.println(parentwindow);
		
      	Set<String> windows=driver.getWindowHandles();
      	
      	
      	
      	Iterator<String> itr=windows.iterator();
      	
      	
      
      	while(itr.hasNext())
      	
      	{
      	
      	String childwindow=itr.next();
      	
      	
      	if(!parentwindow.equals(childwindow))
      		
      	{
      	
      		
      		driver.switchTo().window(childwindow);
      		
      		System.out.println(driver.switchTo().window(childwindow));
      		
      		String p=driver.switchTo().window(childwindow).getTitle();
      		
      		
      		System.out.println(p);
      	
      	}
      	
      	  	}
      	
      	
      	  driver.switchTo().window(parentwindow);
	      
	      String l=driver.switchTo().window(parentwindow).getTitle();
	
	      
	      System.out.println(l);
      	
      	
      	
      	
      	
      	
      	
      	
      	//  WebDriver.SwitchTo().Window(WebDriver.WindowHandles[1]); simply written code
      	
   /*   	String parentwindow1=itr.next();
      	
      	String childwindow1=itr.next();
      	
      	if (!parentwindow1.equals(childwindow1))
      		
      	{
      	
      	
      	
      	driver.switchTo().window(childwindow1);
      	
      	String w=driver.switchTo().window(childwindow1).getTitle();
      	
      	System.out.println(w);
      	
      	
      	}
      	
      	
      	driver.switchTo().window(parentwindow1);
      	
      	String p=driver.switchTo().window(parentwindow1).getTitle();
      	
      	System.out.println(p);
      	
      	*/
      	
		

      	
      	

	}

}
	

