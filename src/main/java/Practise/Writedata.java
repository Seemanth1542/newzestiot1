package Practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writedata {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		
		ArrayList<String>  a=new ArrayList<String>();
		
		a.add("seemanth");
		a.add("Rangoju");
		a.add("yeshwanth");
		a.add("lattu");
		a.add("bittu");
		
		
		
		File f=new File("D:\\Write.xlsx");
		
		
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook wb = new  XSSFWorkbook(fis);
		
		XSSFSheet sh=wb.getSheetAt(0);
		
		
		for (int r = 0; r < a.size(); r++) 
		
		{
			   Row row = sh.createRow(r);
			   row.createCell(0).setCellValue(a.get(r));
			}

			
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(f);
			wb.write(fos);
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
