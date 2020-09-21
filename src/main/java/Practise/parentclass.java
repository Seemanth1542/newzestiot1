package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class parentclass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "E:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		
		WebElement w=driver.findElement(By.cssSelector("#ctl00_mainContent_group_details"));
		
		Select drp1=new Select(w);
		
		drp1.selectByVisibleText("MAA");
		
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		
		WebElement element= driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_Adult']"));
		
		Select drpdwn=new Select(element);
		
		drpdwn.selectByVisibleText("3");
		
		String p=driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText();
		
		System.out.println(p);
		
		
		
		
		
		
		
		
		
	}

}
