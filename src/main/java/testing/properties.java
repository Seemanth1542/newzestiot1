package testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;


public class properties {

	public static void main(String[] args) throws Throwable {
		
		
		Properties prop=new Properties();
		
		FileInputStream fis = new FileInputStream("E:\\Avileap workspace\\NewZestiot\\src\\main\\java\\testing\\extent.properties");
		
       prop.load(fis);
        
	   System.out.println(prop.getProperty("Browser"));
       
       System.out.println(prop.getProperty("URL"));
       
       prop.setProperty("Browser", "Firefox");
       
	 FileOutputStream fos=new FileOutputStream("E:\\Avileap workspace\\NewZestiot\\src\\main\\java\\testing\\extent.properties");
       
	 prop.store(fos, null);
	 
	 
	 
      
}

	
	}

