package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Neenu%20Thomas/Downloads/alert.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		
	     //driver.switchTo().alert();
		
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		
		if(text.equals("alert box"))
		{
			System.out.println("text pass");
		}
		else
		{
			System.out.println("text fail");
		}
		a.accept();
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("neenu");
		
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("thomas");
	}

}
