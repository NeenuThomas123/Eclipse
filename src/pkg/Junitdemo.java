package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junitdemo 
{
	 //ChromeDriver Driver;//null
	@Before
	public void setup()
	{
		 //Driver=new ChromeDriver();
		 //Driver.get("https://www.google.com");
		System.out.println("browser open");
	}
	@Test
	public void test()
	{
		 //String src=Driver.getTitle();
		//System.out.println(src);
		System.out.println("test activities");
	}
	@After
	public void close()
	{
		System.out.println("broswer close");
			 
		 }
		 
	}
