package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath 
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("neenu123");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("neenu");
		
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
	}

}
