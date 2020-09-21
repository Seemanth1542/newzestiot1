package Practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greencart {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		
		System.setProperty("WebDriver.chrome.driver","E:\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		
		List<WebElement>   a  = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		
/*for(int i=0;i<=a.size();i++)
			
		{
			
			String name1=a.get(i).getText();
			
		
			
			System.out.println(name1);
			
		Thread.sleep(3000);
			
		}
		*/
		
		
		String p= "cucumber" ;
		
		Thread.sleep(3000);
		
		List<WebElement>    b = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		Thread.sleep(5000);
		
		for(int j=0;j<b.size();j++)
			
		{
			
			String name=a.get(j).getText();
			
			Thread.sleep(3000);
			
			System.out.println(name);
			
			Thread.sleep(3000);
			
			
			if(name.contains(p))
					
					
					{
			
				
				for(int k=1;k<5;k++)
				
				{
				
					Thread.sleep(5000);
					
					
					
				
					driver.findElements(By.xpath("//a[@class='increment']")).get(j).click();
					
					
					
					
					
				Thread.sleep(3000);
				
				}
				
				
				
				
					
					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(j).click();
				
					System.out.println("ITem is successfully added to Cart");
					
					
					
			Thread.sleep(5000);
			
			
			
				}
			

		
				System.out.println("=================================================");
				
				
				
				
				
				
			}
			
			
			
		
	}

	}
