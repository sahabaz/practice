package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class select 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a dmin\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("file:///C:/Users/a%20dmin/Desktop/multiple.html");
		WebElement e = d.findElement(By.id("abc"));
		Select s = new Select(e);
		Robot r = new Robot();
		List<WebElement> list = s.getOptions();
		HashSet<String> h = new HashSet<>();
		ArrayList<String> a = new ArrayList<>();
		for(WebElement s1 : list)
		{
			String s2 = s1.getText();
			h.add(s2);
			a.add(s2);
		}
		for(String s1 : h)
		{
			int count=0;
			for(String s2 : a)
			{
				
				if(s1.equals(s2))
				{
					count++;
				}
				if(count>1)
				{
					r.keyPress(KeyEvent.VK_CONTROL);
					Thread.sleep(1000);
					s.selectByVisibleText(s1);
				}
			}
			Thread.sleep(1000);
			r.keyRelease(KeyEvent.VK_CONTROL);
		}
			
		
//		for(WebElement s1 : list)
//		{
//			String s2 = s1.getText();
//			if(!(h.add(s2)))
//			{
//				System.out.println("Duplicates are there");
//				break;
//			}
//		}	
	}
}
