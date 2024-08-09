package Testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandling
{
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void test()
	{
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent window title" +driver.getTitle());
		
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allwindowhandles = driver.getWindowHandles();
		
		for(String handle:allwindowhandles)
		{
			System.out.println(handle);
			
			if(!handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("neenu123");
				
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
				
				driver.close();
			}
			
			driver.switchTo().window(parentwindow);
		}
		
		//new tab  open
		
		//WebDriver driver1 = driver.switchTo().newWindow(WindowType.TAB);
		
		//new window open
		WebDriver driver1 = driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver1.get("https://www.google.com");
		
		
	}

}
