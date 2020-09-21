package testing;

import java.io.FileInputStream;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Testng1 {

	@BeforeSuite
	
	
	public void Warangal()
	
	{
	
	System.out.println("Before suite");
		
	}
	
	@Test
	
	public void CAR()
	{
	
	System.out.println("Car is the best option to travel from warangal");
	

	}

	
	@AfterMethod
	
	public void Fuel()
	
	{
	
	System.out.println("Aftermethod");
	}
	
	
	@BeforeTest
	
	public void Hyderabad()
	
	{
	
	System.out.println("BeforeTest");
		
	}
	
	
	@AfterTest
	
	public void Theatre()
	
	{
	
	System.out.println(" AfterTest ");
	}
	
	@Test
	
	public void shopping()
	
	{	
	System.out.println("Go for shopping buying clothes");
	}
	
	
	@BeforeClass
	
	public void halt ()
	
	{

	System.out.println("BeforeClass");
	
	}
	
	
	@Test
	
	public void restaurant()
	{
	
	System.out.println("testit");
	
	}
	
	@AfterClass
	
	public void meetings()
	
	{
	
	System.out.println("AfterClass");
	
	}
	
	
	@Test (groups= {"smoke"})
	
	
	public void relatives()
	
	
	{
	
	System.out.println(" meet relatives  ");
	
	
	}
	
	@Test
	
	public void games()
	
	{
	
	System.out.println("play any game if there is time");
	}
	
	
	@Test
	
	public void hostel()
	{
	
	System.out.println(" look for hostel to stay");
	
	}
	
	@AfterSuite
	
	public void computer()
	
	
	{
	
	System.out.println(" Aftersuite");
	
	}

	@BeforeMethod
	
	public void refresh()
	{
	
	System.out.println(" refresh before method ");
	}
	
}