package demo;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng 
{
	@Test
	public void a(ITestResult result)
	{
//		System.out.println(result.getName());
		Reporter.log(result.getName() , false);
	}
	
	@Test
	public void b()
	{
		System.out.println("second");
	}
	
	
}
