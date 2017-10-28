package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaleElement 
{
	
	
//	public StaleElement(WebDriver d) 
//	{
//		usrnm = d.findElement(By.id("username"));
//		psd = d.findElement(By.name("pwd"));
//		login = d.findElement(By.xpath("//div[.='Login ']"));
//		
//	}
	public static WebDriver d;
	
	@FindBy(id="username")
	private WebElement usrnm;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	public WebElement getusername()
	{
		return usrnm;
		
	}
	
	public StaleElement(WebDriver d) 
	{
		this.d=d;
		PageFactory.initElements(d, this);
	} 
//	public WebElement getpsswd()
//	{
//		return psd;
//	}
	
	public WebElement getlogin()
	{
		return login;
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a dmin\\Desktop\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://demo.actitime.com/");
		StaleElement s = new StaleElement(d);
		s.getusername().sendKeys("sxasd");
//		s.pswd().sendKeys("hgvs");
		s.getlogin().click();
		Thread.sleep(2000);
		s.getusername().sendKeys("Admin");
//		s.getpsswd().sendKeys("manager");
		s.getlogin().click();

	}

}
