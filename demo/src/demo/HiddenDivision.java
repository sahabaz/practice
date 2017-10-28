package demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDivision 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Date date = new Date();
		SimpleDateFormat s = new SimpleDateFormat("d");
		SimpleDateFormat s1 = new SimpleDateFormat("MMMM");
		SimpleDateFormat s2 = new SimpleDateFormat("YYYY");
		String a = s.format(date);
		String a1 = s1.format(date);
		String a2 = s2.format(date);
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\a dmin\\Desktop\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.cleartrip.com/");
		d.findElement(By.id("DepartDate")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//span[.='"+a1+"']/../../..//a[.='"+a+"']")).click();
	}
}
