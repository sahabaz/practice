package demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng1 
{
	@BeforeMethod
	public void c()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void d()
	{
		System.out.println("After method");
	}
	
	@BeforeClass
	public void e()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public void f()
	{
		System.out.println("After class");
	}
}
