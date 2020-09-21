import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Csp {

	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Avileap workspace\\NewZestiot\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://login.microsoftonline.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("seemanth.rangaoju@ideaentity.com");
	
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("seemanth.rangaoju");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Seem@nth1542");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@id='idBtn_Back']")).click();
		
		driver.get("https://ideaentity.sharepoint.com/teams/SAFFMCSP/cpts3");
		
		Thread.sleep(20000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		 WebDriverWait wait = new WebDriverWait(driver,20);
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='createinqbtn']")));
		
		
		driver.findElement(By.xpath("//a[@class='createinqbtn']")).click();
		
		
		    
         Thread.sleep(40000);
		
         
         WebElement element=driver.findElement(By.xpath("//input[@id='cin_title']"));
         
         
         js.executeScript("arguments[0].scrollIntoView();", element);
         
         
         
	//	js.executeScript("window.scrollBy(0,1000)","");
		    
		 
//		driver.findElement(By.xpath("//div[@id='s4-workspace']"));
		 
		 
		
		 
	//	  Actions actions = new Actions(driver);
	
		  
		  
		  //	    for(int i=1;i<=2;i++)
	//	    {
		  // Scroll Down using Actions class
		
		  
	//	  actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		  
		    
		//    	   Thread.sleep(20000);
		    	   
		    	   
		//    }
		
		
		
	    
	    
	    File f=new File("D:\\CSP.xlsx");
	    
	    FileInputStream fis=new FileInputStream(f);
		
	    
	    XSSFWorkbook w=new XSSFWorkbook(fis);
	    
	    
	    XSSFSheet sh=w.getSheet("civilian");
	    
	/*    int rowcount=sh.getLastRowNum();
	    
	    for(int i=0;i<rowcount;i++)
	    	
	    {
	    	
	    	Row r=sh.getRow(i);
	    	
	    	int colcount=r.getLastCellNum();
	    	
	    	String celldata="";
	    	
	    	
	    	for(int j=0;j<rowcount;j++)
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	  
	    */
	    
	    String s=sh.getRow(1).getCell(0).getStringCellValue();
	   
	    
	    Thread.sleep(3000);
	    
	    
	    driver.findElement(By.xpath("//input[@id='cin_title']")).sendKeys(s);
	    
	    
	    Select drpdwn=new Select(driver.findElement(By.xpath("//select[@name='Category']")));
	    
	    
	    drpdwn.selectByVisibleText("Civilian Pay");
	    
	    
	    Select drpdwn1=new Select(driver.findElement(By.xpath("//select[@name='SubCategory']")));
	    
	    
	    drpdwn1.selectByVisibleText("Advance Leave");
	    
	    
	    String s1=sh.getRow(1).getCell(1).getStringCellValue();
	    
	    
	    driver.findElement(By.xpath("//div[@class='note-editable description']")).sendKeys(s1);
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//label[@id='csp_attachFile_label']")).click();
	    
	    WebElement browse =driver.findElement(By.xpath("//label[@id='csp_attachFile_label']"));
	    //pass the path of the file to be uploaded using Sendkeys method
	    browse.sendKeys("D:\\image.jpg");
	    //'close' method is used to close the browser window
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   
		
	}

}
