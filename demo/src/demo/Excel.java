package demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
	{
		Date date = new Date();
//		SimpleDateFormat s = new SimpleDateFormat("d");
		SimpleDateFormat s1 = new SimpleDateFormat("hh");
		SimpleDateFormat s2 = new SimpleDateFormat("mm");
//		String a = s.format(date);
		String a1 = s1.format(date);
		String a2 = s2.format(date);
//		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
//		File f = new File("C:\\Users\\a dmin\\Desktop\\testData.xls");
//		Workbook w = WorkbookFactory.create(f);
//		String s = w.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(s);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a dmin\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/");
		TakesScreenshot t = (TakesScreenshot) d;
		File src = t.getScreenshotAs(OutputType.FILE);
		Thread.sleep(1000);
		FileUtils.copyFile(src, new File("C:\\Users\\a dmin\\Desktop\\screen\\" +a1+ a2 + ".png"));
//		FileUtils.copyFile(src, new File("C:\\Users\\a dmin\\Desktop\\screen\\"++".png"));
	}
}
