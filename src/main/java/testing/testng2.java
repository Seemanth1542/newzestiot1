package testing;

import org.testng.annotations.Test;

public class testng2 {

	@Test
	
	public void flight()
	{
	
      System.out.println("flights are running");
	}

   @Test(dependsOnMethods= {"indigo","flight"})
   
   public void airasia()
   
   {
	
	System.out.println("cheap cost");
	
   }
	
   
   @Test (groups= {"smoke"})
   
   public void spicejet()
   
   {
   
   System.out.println("high cost");
   
   }
   
   @Test
   
   public void indigo()
   
   {
   
   System.out.println("medium cost");
   }
   
   
   
   
}
