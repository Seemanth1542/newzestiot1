package Practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
          System.setProperty("WebDriver.chrome.Driver", "E:\\chrome_proxy.exe");
		
		   
          
          
		   WebDriver driver=new ChromeDriver();
		   
		   
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.google.com/");
		
		
		File scr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		FileUtils.copyFile(scr, new File("D://Screenshot.png"));
		
		
		
		
		
		
		
	}

}
