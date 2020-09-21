import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfile2 {

	public static void main(String[] args) throws Throwable {
		
		File p=new File("E:\\excel.xlsx");
		
		FileInputStream fis=new FileInputStream(p);
		
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet s=wb.getSheet("sheet1");
		
		int rowcount=s.getLastRowNum();
		
		for( int i=0;i<rowcount;i++)
			
		{
			
			Row r=s.getRow(i);
			
			int colcount=r.getLastCellNum();
			
			String celldata="   ";
			
			
			for (int j=0;j<colcount;j++)
				
			{
			 
				
				
				if(s.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_NUMERIC)
                
               {
				
				
				
				int data = (int) (s.getRow(i).getCell(j).getNumericCellValue());
				
				celldata=String.valueOf(data);
				
				
			}
			
			
				else 
					
				{		
		
		             celldata=s.getRow(i).getCell(j).getStringCellValue();
				}

				  
				
				
				
				
				
				System.out.println(celldata);
				
	}
			
			
			

			System.out.println("========================");
}
	
}
}
