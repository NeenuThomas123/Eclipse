package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazeregister 
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("name")).sendKeys("neenu");
		
		driver.findElement(By.name("company")).sendKeys("luminar");
		
		driver.findElement(By.id("email")).sendKeys("neenu123");
		
		driver.findElement(By.id("password")).sendKeys("vbh321");
		
		driver.findElement(By.id("password-confirm")).sendKeys("vbh321");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
