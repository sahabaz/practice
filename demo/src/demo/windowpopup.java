package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowpopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a dmin\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.naukri.com/");
		
		Set<String> set = d.getWindowHandles();
		System.out.println(set);
		d.quit();
//		for(String s : set)
//		{
//			d.switchTo().window(s);
//			System.out.println(d.getTitle());
//			d.close();
//			Thread.sleep(2000);
//		}
		
//		Iterator<String> it = set.iterator();
//		String s1 = it.next();
//		String s2 = it.next();
//		String s3 = it.next();
//		d.switchTo().window(s3);
//		d.close();
		
	}
	

}
