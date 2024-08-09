package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{

	public static void main(String[] args)
	{
		ChromeDriver Driver=new ChromeDriver();
		
		Driver.get("http://www.google.com");
		String actualtitle=Driver.getTitle();
		System.out.println(actualtitle);
		
		String expected="google";
		
		if(actualtitle.equals(expected))
		{
			System.out.println("Test pass");
			
		}
		else
		{
			System.out.println("Test fail");
		}
		Driver.close();
		//Driver.quit();

	}

}
