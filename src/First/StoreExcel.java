package First;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StoreExcel {

	public static void main(String[] args) throws Throwable, IOException {
	   FileInputStream fis=new FileInputStream("./Excel/Brook3.xlsx");
	   Workbook wb=WorkbookFactory.create(fis); 
	   Sheet sh=wb.getSheet("Sheet1");
	   Row r=sh.createRow(4);
	   Cell c=r.createCell(4);
	   Cell c1=r.getCell(1);
	   c.setCellValue("Text");
	   FileOutputStream fos=new FileOutputStream("./Excel/Brook3.xlsx");
	   wb.write(fos);
	   fos.close();
	   fis.close();
	  
	   
	   
	   
	   

	}

}
