package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
//		Runtime.getRuntime().exec("C:\\Users\\a dmin\\Desktop\\demo.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a dmin\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/");
		Thread.sleep(1000);
		d.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(1000);
		WebElement e = d.findElement(By.name("pwd"));
		d.navigate().refresh();
		e.sendKeys("manager");
		

	}

}
