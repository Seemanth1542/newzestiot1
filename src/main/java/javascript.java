import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javascript {

	@Test
	
	public void javascript()
	
	{	
             
		 System.setProperty("WebDriver.chrome.Driver", "E:\\chromedriver.exe");
			
		   
         
         
		   WebDriver driver=new ChromeDriver();
		   
		   
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.seleniumeasy.com/test/");
		
		driver.switchTo().alert().dismiss();
		
		
		
		
		
		
		
			
		
	}

}
