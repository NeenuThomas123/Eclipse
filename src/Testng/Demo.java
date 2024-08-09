package Testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo 
{
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		System.out.println("broswer open");
	}
	@BeforeMethod
	public void urlload()
	{
		System.out.println("url open");
	}
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	@Test
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void report()
	{
		System.out.println("report generation");
	}
	@AfterTest
	public void close()
	{
		System.out.println("browser close");
	}
	

}
