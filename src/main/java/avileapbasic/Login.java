package avileapbasic;

import static org.testng.Assert.assertTrue;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Login {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		
System.setProperty("Webdriver.chrome.driver", "E:\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

//System.setProperty("webdriver.chrome.driver","E:\\Avileap workspace\\NewZestiot\\driver\\chromedriver.exe");
		
//WebDriver driver=new ChromeDriver();


		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://test.sandbox.avileap.com/app/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("login")).sendKeys("anantgmr@zestiot.io");
		
		driver.findElement(By.id("password")).sendKeys("zestiot123");
		
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/div/app-topnav/mat-toolbar/mat-sidenav/div/mat-nav-list[1]/mat-list-item/div/mat-icon")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("/html/body/app-root/div/app-topnav/mat-toolbar/mat-sidenav/div/mat-nav-list[3]/mat-list-item/div/div[2]/a")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/app-root/div/app-topnav/mat-toolbar/mat-sidenav/div/mat-nav-list[3]/mat-nav-list[4]/mat-list-item/div/div[2]/a/span")).click();
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-turnaround-list-v1/div/div/div[2]/mat-tab-group/mat-tab-header/div[2]/div/div/div[3]/div")).click();
		
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-turnaround-list-v1/div/div/div[1]/div[2]/div/div/app-filters/div/div[2]/mat-form-field/div/div[1]/div[4]/input")).clear();
		
		
		
		driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-turnaround-list-v1/div/div/div[1]/div[2]/div/div/app-filters/div/div[2]/mat-form-field/div/div[1]/div[4]/input")).sendKeys("2020-03-19");
		 
		

	
		
	     driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-turnaround-list-v1/div/div/div[1]/div[2]/div/div/app-filters/div/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("I5");
	
	    driver.findElement(By.xpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-turnaround-list-v1/div/div/div[1]/div[2]/div/div/app-filters/div/div[3]/button/mat-icon")).click();
	    
	    Thread.sleep(6000);
	    
	    
	    
	    
	   String departedflight= driver.findElement(By.xpath("(//div[@class='mat-tab-labels'])/div[3]")).getText();
	   
	   System.out.println(departedflight);
	
	   String str_departedflightCount = departedflight.replaceAll("[^0-9]", "");
	   int departedflightCount= Integer.valueOf(str_departedflightCount);
	   
	   System.out.println(departedflightCount);
	   
	 
	 
	   
	   
	   
	 // WebElement  a = driver.findElement(By.id("cardviewid1"));
       

	   
	  // List<WebElement> allRows = driver.findElements(By.xpath("//*[@id=\"selectedCard\"]/div/div[1]/div[1]/p"));
	// And iterate over them, getting the cells
	/*for (WebElement row : allRows) {
	    List<WebElement> cells = row.findElements(By.xpath("//*[@id=\"selectedCard\"]/div/div/div[1]"));
	    for (WebElement cell : cells) {
	        System.out.println("content >>   " + cell.getText());
	    }
	} */
        	
      
	 
        	
  driver.findElement(By.xpath("//*[@id=\"selectedCard\"]/div/div/div[1]")).click();
 
  Actions actions = new Actions(driver);
    for(int i=1;i<=2;i++)
    {
  // Scroll Down using Actions class
  actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
  
    
    	   Thread.sleep(20000);
    	   
    	   
    }
    	   
    	 //  actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
    	   
    	  // Thread.sleep(20000);
    	   
    	   
	 List<WebElement> allRows = driver.findElements(By.xpath("//*[@id=\"selectedCard\"]/div/div[1]/div[1]/p"));
	 
	 for(WebElement element:allRows)
		 
	 {
	 
      
         String name =element.getText();
       Thread.sleep(5000);
         
        
         	   
         
         
         System.out.println(name);
           
       
           
 
 
 }
 
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/app-root/div/app-topnav/mat-toolbar/div[4]/div[2]")).click();
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"cdk-overlay-2\"]/div/div/div/button")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
