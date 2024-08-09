package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Content 
{
	public static void main(String[] args)
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("http://www.google.com");
		String actual=Driver.getPageSource();
		String expected="Gmail";
		if(actual.contains(expected))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
		Driver.close();
	}

}
