package Practise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("WebDriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Seemanth");
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		
		Thread.sleep(5000);
		
		
		
		Alert a=driver.switchTo().alert();
		
		System.out.println(a.getText());
		
		
		a.accept();
		

		
		
		
		
		
		
	}

}
