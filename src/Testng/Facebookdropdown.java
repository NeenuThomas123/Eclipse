package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Facebookdropdown
{
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void open()
	{
		driver.get("http://www.facebook.com/signup");
	}
	@Test
	public void test()
	{
	 WebElement dayelement = driver.findElement(By.xpath("//*[@id=\"day\"]"));
	 Select day=new Select(dayelement);
	 day.selectByValue("12");
	 
	WebElement monthelement = driver.findElement(By.xpath("//*[@id=\"month\"]"));
	Select month=new Select(monthelement);
	month.selectByIndex(6);
	
	WebElement yearelement = driver.findElement(By.xpath("//*[@id=\"year\"]"));
	Select year=new Select(yearelement);
	year.selectByVisibleText("2016");
	 
	}

}
