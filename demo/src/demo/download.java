package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class download 
{
	public static void main(String[] args) 
	{
		FirefoxProfile f = new FirefoxProfile();
		f.setPreference("browser.download.dir", "E:\\");
		f.setPreference("browser.download.folderList", 2);
		f.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		WebDriver d = new FirefoxDriver(f);
		d.get("http://www.seleniumhq.org/download/");
		d.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
	}
}
