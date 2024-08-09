package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Blazelogin;
import Pages.Blazeregister;

public class Blazetest
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/register");
	}
	
	@Test
	public void register()
	{
		Blazeregister ob=new Blazeregister(driver);
		ob.setvalues("neenu", "luminar", "neenukaduvanal123@gmail.com", "neenu@123","neenu@123" );
		ob.register();
				
	}
	
	@Test
	public void login()
	{
		
		driver.findElement(By.xpath("//*[@id=\"app-navbar-collapse\"]/ul[2]/li[1]/a")).click();
		Blazelogin ob=new Blazelogin(driver);
		ob.setvalues("neenukaduvanal123@gmail.com","neenu@123" );
		ob.login();
	}

}
