package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.TakesScreenshot;
public class Utilities {

	public static String Readdatafrompropertiesfile(String key) throws IOException
	{
		FileInputStream File = new FileInputStream("C:\\Users\\91950\\eclipse-workspace\\Eclipse workspace\\SAIL01\\TESTDATA\\SAIL.properties");
	Properties p = new Properties();
	p.load(File);
	String value=p.getProperty(key);
	return value;
		
	}
	public static void TakeSS(WebDriver driver,int TCID) throws IOException
	{
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest = new File("C:\\Users\\91950\\eclipse-workspace\\Eclipse workspace\\SAIL01\\FAILEDTESTCAS"+TCID+".jpeg");
		FileHandler.copy(src, dest);
	
	}
	
	public static void Fetchdatafromexcelsheet(int row,int cell,String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream File = new FileInputStream("C:\\Users\\91950\\eclipse-workspace\\Eclipse workspace\\30july_maven1\\TESTDATA\\XL.xlsx");
		WorkbookFactory.create(File).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
	}
}
