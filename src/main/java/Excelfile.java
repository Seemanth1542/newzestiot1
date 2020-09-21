import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelfile {

	public static void main(String[] args) throws Throwable {
		File p=new File("E://excel.xlsx");
		
		FileInputStream fis= new FileInputStream(p);
		
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet s=wb.getSheet("sheet1");
		
		
		String data= s.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);
		
		
		

	}

}
