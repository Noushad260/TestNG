package First;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFatch {
	
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("./Excel/Noushad.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Sheet1");
	Row r=sh.getRow(2);
	Cell c=r.getCell(1);
	//System.out.println("Result = "+c.getStringCellValue());
	RichTextString data=wb.getSheet("Sheet1").getRow(2).getCell(1).getRichStringCellValue();
	System.out.println(data);
	
}
}
