package First;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExcelFlipkart {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {

		FileInputStream fis = new FileInputStream("./Excel/Noushad.xlsx");
	
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("Mobile", Keys.ENTER);
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		System.out.println(name.size());
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		int j=1;
		 for(WebElement e:name) {
				// System.out.println(e.getText());
				 String product=e.getText();
					   Row r=sh.createRow(j);
					   Cell c=r.createCell(0);
					   Cell c1=r.createCell(1);
					   c.setCellValue(e.getText());
					   String price=driver.findElement(By.xpath("//div[text()='"+product+"']/../../div[2]/div/div/div")).getText();
					   c1.setCellValue(price);
					   FileOutputStream fos=new FileOutputStream("./Excel/Noushad.xlsx");
					   wb.write(fos);
					   j++;
		         }
	
	}
	}
		

