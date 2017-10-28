package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo 
{
	
	private int amt;

	public int getAmt() 
	{
		return amt;
	}
	
	demo(int amt ){
		this.amt = amt;
	}
//	public void setAmt(int amt) 
//	{
//		this.amt = amt;
//	}

	public static void main(String[] args) throws InterruptedException 
	{
//		WebDriver d = new FirefoxDriver();
//		d.navigate().to("file:///C:/Users/a%20dmin/Desktop/table.html");
//		d.get("file:///C:/Users/a%20dmin/Desktop/table.html");
		
		 demo d = new demo(777);
		 //d.setAmt(1000);
		 System.out.println(d.getAmt());
		 
		 demo d1 = new demo(99999);
		// d1.setAmt(20000);
		 System.out.println(d1.getAmt());
		
	}
}
