package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demopgm 
{
	@BeforeTest
	public void setup()
	{
		System.out.println("broswer open");
	}
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("url open");
		
	}
	@Test(priority=3,enabled=false)
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(priority=2,invocationCount=2)
	public void test2()
	{
		System.out.println("test2");
	}
	@Test(priority=1,dependsOnMethods= {"test2"})
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void method()
	{
		System.out.println("report generating");
	}
	@AfterTest
	public void close()
	{
		System.out.println("browser close");
	}

}
