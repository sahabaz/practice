package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a dmin\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions a = new Actions(d);
		a.moveToElement(d.findElement(By.xpath("//span[.='Women']"))).perform();
		Thread.sleep(1000);
		d.findElement(By.xpath("//span[.='Kurtas & Kurtis']")).click();
		Thread.sleep(1000);
		WebElement e1 = d.findElement(By.xpath("//div[@class='gl5Kwg']"));
//		WebElement e2 = d.findElement(By.xpath("//div[@style='transform: translateX(-67.67px);']/div"));
//		a.dragAndDropBy(e1, 0, 0).perform();
		Action e = a.dragAndDropBy(e1, 0, 10).build();
		e.perform();
		
		
	}
}
