import java.io.File;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	public static void main(String[] args)  throws Throwable
	     {
		
		System.setProperty("webdriver.chrome.driver","E:\\Avileap workspace\\NewZestiot\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.get("https://www.google.com/");
		
		
		Thread.sleep(4000);
		
	/*	Thread.sleep(4000);
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Thread.sleep(5000);
		
		FileUtils.copyFile(scr, new File("E:/seemanth1.jpg"));
		
		*/
		driver.close();
		
		
		
		
		

	}

}
