package Practise;



import java.awt.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
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
import org.openqa.selenium.support.ui.WebDriverWait;



public class linkedin {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
	System.setProperty("Webdriver.chrome.driver","E:\\chromedriver.exe");
	
	
	
	ArrayList<String> a=new ArrayList<String>();
	
	
	
	WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.linkedin.com/home");
	
	driver.manage().window().maximize();
	
	
	
	
	driver.findElement(By.xpath("//a[@class='nav__button-secondary']")).click();
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("8309205843");
	
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("zestiot123");
	
	
	driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();
	
	
	Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Enhops");
	
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
	
	Thread.sleep(5000);
	
	String l =driver.findElement(By.xpath("//h3[contains(@class,'clear-both')]")).getText();
	
	System.out.println(l);
	
	int i=Integer.parseInt(l.replaceAll("[\\D]", ""));
	
	System.out.println(i);
	
	
	System.out.println(driver.findElement(By.xpath("(//h3[text()='Showing 113 results']) [1]")).getText());

	Thread.sleep(5000);
	
	
	
/* List<WebElement> ele = driver.findElements(By.xpath("//ul[contains(@class,'search-results__list list-style-none')]/li"));


Iterator<WebElement> itr= ele.iterator();
while(itr.hasNext()) */
	

	for( int j=1;j<=12;j++)
		
		
	{
		Thread.sleep(2000);

		
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		
		js2.executeScript("window.scrollBy(0,3000)");
		
		
		Thread.sleep(4000);
		
		if(j==1)
			
		{
			
			driver.findElement(By.xpath("//ul[contains(@class,'artdeco-pagination__pages artdeco-pagination__pages--number')]/li[1]/button")).click();
			
		}
		
		else
			
		{
		
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		}
	//	WebDriverWait wait = new WebDriverWait(driver,7);
		
	//	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[contains(@class,'artdeco-pagination__pages artdeco-pagination__pages--number')]/li["+j+"]/button")));
         // click on the compose button as soon as the "compose" button is visible
 // driver.findElement(By.xpath("//ul[contains(@class,'artdeco-pagination__pages artdeco-pagination__pages--number')]/li["+j+"]/button")).click();
  
		
		//driver.findElement(By.xpath("//ul[contains(@class,'artdeco-pagination__pages artdeco-pagination__pages--number')]/li["+j+"]/button")).click();
		/* WebElement element=driver.findElement(By.xpath("//ul[contains(@class,'artdeco-pagination__pages artdeco-pagination__pages--number')]/li["+j+"]/button"));
		
		Thread.sleep(2000);
		
		Actions mouse=new Actions(driver);
		
		
		mouse.moveToElement(element).click().build().perform(); */
		
		Thread.sleep(3000);
		
		//String s=driver.findElement(By.xpath("//ul[contains(@class,'artdeco-pagination__pages artdeco-pagination__pages--number')]/li["+j+"]/button/span[1]")).getText();
		
		String s=driver.findElement(By.xpath("//span[contains(text(),"+j+")]")).getText();
		
		int c=Integer.valueOf(s);
		
		
		
		
		
		js2.executeScript("window.scrollBy(0,-3000)");
		
		
	
	
		
		
	
	 
	
		 if (c==1)
			 
		 {	 
			 
			 for (int n=1;n<=11;n++)
				 
			 {
			 
				 if (n==4)
				 {  
			 Thread.sleep(2000);
			 
			 String empname=driver.findElement(By.xpath("//ul[contains(@class,'search-results__list list-style-none')]/li[4]/div/div/div[2]/a/h3")).getText();
			 
			 System.out.println(empname);
			 
			 a.add(empname);
			 
				 }
				 else
					 
					 
				 {
			 
			 
					 Thread.sleep(4000);
						String empname=driver.findElement(By.xpath("//ul[contains(@class,'search-results__list list-style-none')]/li["+n+"]/div/div/div[2]/a/h3/span/span/span[1]")).getText();
						
					System.out.println(empname);
						 
						 a.add(empname);

						
						Thread.sleep(5000);
						
						JavascriptExecutor js = (JavascriptExecutor) driver;
						
						js.executeScript("window.scrollBy(0,250)");
						
						
				 }
			 
			 
			 
			 }
			 
		 
		 }
		 
		 else {
		 
			 
			 for(int p=1;p<=10;p++)
				 
			 {
			 
	Thread.sleep(4000);
	String empname=driver.findElement(By.xpath("//ul[contains(@class,'search-results__list list-style-none')]/li["+p+"]/div/div/div[2]/a/h3/span/span/span[1]")).getText();
	
	System.out.println(empname);
	 
	 a.add(empname);
	
	 String lastname="Neelima Joshi";
	 if (empname.equalsIgnoreCase(lastname))
		 
	 {
		
		 System.out.println("it has reached last name");
		 
		 break;
		 
	 }	
	 
	 
	
	Thread.sleep(5000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("window.scrollBy(0,250)");
	
	
			 }
	
	
			 
			
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
	 }
	
	
		 
		 
				 
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		 
		 
	
	
	
	
	
	 File f=new File("D:\\Write3.xlsx");
		
		
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook wb = new  XSSFWorkbook(fis);
		
		XSSFSheet sh=wb.getSheetAt(0);
		
		
	/*	for (int counter = 0; counter < a.size(); counter++) { 		      
	          
			
			String obj=a.get(counter); 		
	        	
			Thread.sleep(3000);
		
		
		for (int r = 0; r==counter; r++) 
			
		{
			   Row row = sh.createRow(r);
			   
			   row.createCell(0).setCellValue(obj.get(r).);
			   
			   Thread.sleep(2000);
			   
			   
			}


			
		
	        
		}
	        */
			
			
			for (int r = 0; r < a.size(); r++) 
				
			{
				   Row row = sh.createRow(r);
				   row.createCell(0).setCellValue(a.get(r));
				   
				   Thread.sleep(2000);
				}
			
	        
	       
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			fos.close();
			
		

	
		
	}
}
	
	

	
	

