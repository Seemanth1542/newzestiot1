package Practise;

import org.omg.PortableInterceptor.ACTIVE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("WebDriver.chrome.driver", "E:\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		
		
		
		
		int a=driver.findElements(By.tagName("iframe")).size();
		
		
		System.out.println(a);
		
		// switch to frame which u want to drag the frame
		
		driver.switchTo().frame(0);
		
		
		
		Actions act=new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
		
		
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		act.dragAndDrop(source, target).build().perform();
		
		
		driver.switchTo().defaultContent();
		
		
		driver.findElement(By.xpath("//a[text()='Accept']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
