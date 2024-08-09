package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook
{
	public static void main(String[] args)
	{
		ChromeDriver Driver=new ChromeDriver();
		Driver.get("http://www.facebook.com");
		String actualtitle=Driver.getTitle();
		System.out.println(actualtitle);
		
		String expected="Facebook – log in or sign up";
		
	if(actualtitle.equals(expected))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
	


		String str=Driver.getPageSource();
		String exp="log in";
		if(str.contains(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		Driver.close();
			
		}

}
