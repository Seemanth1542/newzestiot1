package testing;

import org.testng.annotations.Test;

public class Testng3 {

	@Test (groups= {"smoke"})
	
	public void bicycle()
	
	{
	
	System.out.println("Bicycle cost is 5K");
	
	}
	
	@Test
	
	public void bike()
	{
	
	System.out.println("bike cost is 50k");
	
	}
	
	@Test
	public void car()
	
	{
	
	System.out.println("car cost is 5L");
	}
	
	
	
	
	

}
