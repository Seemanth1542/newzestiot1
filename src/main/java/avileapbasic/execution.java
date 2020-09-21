package avileapbasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class execution {

	public static <Webelement> void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","E:\\Avileap workspace\\NewZestiot\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
				driver.get("https://avileap.com/login");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.id("login")).sendKeys("Admin_bial@zestiot.io");
				
				driver.findElement(By.id("password")).sendKeys("zestiot123");
				
				driver.findElement(By.name("submit")).click();
				
				driver.findElement(By.xpath("/html/body/app-root/div/app-topnav/mat-toolbar/mat-sidenav/div/mat-nav-list[1]/mat-list-item/div/mat-icon")).click();
				
				Thread.sleep(3000);
				
				
				driver.findElement(By.xpath("/html/body/app-root/div/app-topnav/mat-toolbar/mat-sidenav/div/mat-nav-list[3]/mat-list-item/div/mat-icon[2]")).click();
				
				Thread.sleep(4000);
				driver.findElement(By.xpath("/html/body/app-root/div/app-topnav/mat-toolbar/mat-sidenav/div/mat-nav-list[3]/mat-nav-list[4]/mat-list-item/div/div[2]/a/span")).click();
				
				
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-turnaround-list-v1/div/div/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[3]/div")).click();
				
				driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-turnaround-list-v1/div/div/div[1]/div[2]/div/div/app-filters/div/div[2]/mat-form-field/div/div[1]/div[4]/input")).clear();
				
				
				
				driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-turnaround-list-v1/div/div/div[1]/div[2]/div/div/app-filters/div/div[2]/mat-form-field/div/div[1]/div[4]/input")).sendKeys("2020-03-18");
				 
				

			
				
			     driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-turnaround-list-v1/div/div/div[1]/div[2]/div/div/app-filters/div/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("I5");
			
			    driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-turnaround-list-v1/div/div/div[1]/div[2]/div/div/app-filters/div/div[3]/button/mat-icon")).click();
			    
			    Thread.sleep(6000);
			    
			    
			    
			    
			   String departedflight= driver.findElement(By.xpath("(//div[@class='mat-tab-labels'])/div[3]")).getText();
			   
			   System.out.println(departedflight);
			
			   String str_departedflightCount = departedflight.replaceAll("[^0-9]", "");
			   int departedflightCount= Integer.valueOf(str_departedflightCount);
			   
			   System.out.println(departedflightCount);
			   
			   
			   
			   Actions actions = new Actions(driver);
			     for(int i=1;i<=2;i++)
			     {
			   // Scroll Down using Actions class
			    	 
			    	 driver.findElement(By.xpath("//*[@id=\"selectedCard\"]/div/div/div[1]")).click();
			    	 
			    	 Thread.sleep(4000);
			    	 
			   actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
			   
			     
			     	   Thread.sleep(20000);
			     	   
			     	   
			     }
			     
			     List<WebElement> allRows = driver.findElements(By.xpath("//*[@id=\"selectedCard\"]/div/div[1]/div[1]/p"));
				 
			     
			     
			     
				 for(WebElement element:allRows)
					 
				 {
					 
					 
                   
					 Thread.sleep(4000);
					 
					 
					 String name =element.getText();
					 
					 
					 
					 
					 			 
					 Thread.sleep(5000);
					 
					System.out.println(name);
			           
					  Actions p=new Actions(driver);
						 
						 p.moveToElement(element).click().build().perform();
						 
						 
						 Thread.sleep(5000);
						 
						
						 
				List<WebElement> inner =driver.findElements(By.xpath("//*[@id=\"selectedCard\"]/div/div[2]/div/div/app-pts-list[2]/div/div"));
		
				
				
				   for(WebElement element1: inner)
				
				   {
				
				
				
				
				Thread.sleep(4000);
				
				System.out.println("========");
				
				String s=element1.getText();
				
				
				
				System.out.println(s);
				
				
				
				System.out.println("=======");
				
				
				
				
		
				   }
				   
				   
				   
				   System.out.println("=============next flight====================");
				   
				   
		

	}

	
	}
}


