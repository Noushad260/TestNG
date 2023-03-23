package First;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelprog {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream("./Excel/Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		DataFormatter df=new DataFormatter();
		Sheet sh=wb.getSheet("Sheet1");
		System.out.println(df.formatCellValue(sh.getRow(1).getCell(1)));
		
		
	}
}
