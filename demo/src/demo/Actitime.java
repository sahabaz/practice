package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a dmin\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/");
		Thread.sleep(1000);
		d.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(1000);
		d.findElement(By.name("pwd")).sendKeys("manager");;
//		d.navigate().refresh();
		d.findElement(By.xpath("//div[.='Login ']")).click();
		WebDriverWait w = new WebDriverWait(d, 10);
	}
}
