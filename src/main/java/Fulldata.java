
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Fulldata {

	public static void main(String[] args) throws Throwable{
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
				
				
				
				driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-turnaround-list-v1/div/div/div[1]/div[2]/div/div/app-filters/div/div[2]/mat-form-field/div/div[1]/div[4]/input")).sendKeys("2020-03-17");
				 
				

			
				
			     driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-turnaround-list-v1/div/div/div[1]/div[2]/div/div/app-filters/div/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("I5");
			
			    driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-turnaround-list-v1/div/div/div[1]/div[2]/div/div/app-filters/div/div[3]/button/mat-icon")).click();
			    
			    Thread.sleep(6000);
			    
			    
			    
			    
			   String departedflight= driver.findElement(By.xpath("(//div[@class='mat-tab-labels'])/div[3]")).getText();
			   
			   System.out.println(departedflight);
			
			   String str_departedflightCount = departedflight.replaceAll("[^0-9]", "");
			   int departedflightCount= Integer.valueOf(str_departedflightCount);
			   
			   System.out.println(departedflightCount);
			   
			 
			 
			   
			   
			   
			
		      
			 
		        	
		  Actions p=new Actions(driver);
		    for(int i=1;i<=2;i++)
		    {
		  // Scroll Down using Actions class
		  p.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		  
		    
		    	   Thread.sleep(10000);
		    	   
		    	   
		    }
		    	
		    
		    	 
		     WebElement  a = driver.findElement(By.id("cardviewid1"));
		       

			   Thread.sleep(2000);
			  List<WebElement> allRows = driver.findElements(By.xpath("//*[@id=\"mat-tab-content-1-2\"]/div/div"));
			// And iterate over them, getting the cells
			for (WebElement row : allRows) {
				
				List<WebElement> cells = row.findElements(By.xpath("//*[@id=\"selectedCard\"]/div"));
			    for (WebElement cell : cells) {
			        System.out.println("content >>   " + cell.getText());
			    }
			} 
		    
		    	   
		    	   
			/* List<WebElement> allRows = driver.findElements(By.xpath("//*[@id=\"selectedCard\"]/div/div[1]/div[1]/p"));
			 
			 for(WebElement element:allRows)
				 
			 {
			 
		      
		         String name =element.getText();
		       Thread.sleep(5000);
		         
		        
		         	   
		         
		         
		         System.out.println(name);
		           
		       
		           
		 
		 
		 } */
		 
				
				Thread.sleep(4000);
				
		

	}

}
