package demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chkbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d = new FirefoxDriver();
		d.get("file:///C:/Users/a%20dmin/Desktop/checkbox.html");
		List<WebElement> li = d.findElements(By.xpath("//input"));
		ArrayList<WebElement> a = new ArrayList<>(li);
		for(int i=1; i<=a.size(); i++)
		{
			if(i%2!=0)
			{
			Thread.sleep(1000);
			d.findElement(By.xpath("//input["+i+"]")).click(); 
			}
		}
	}
}
