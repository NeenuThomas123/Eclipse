package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonassignment 
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		
		//open amazon site
		
		driver.get("https://www.amazon.in");
	}
	@Test
	public void test()
	{
		//click search field
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		
		//enter mobile in search field
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile",Keys.ENTER);
		
		//click cart field
		
		driver.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click();
		
		//click hello,sign in field
		
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']/div/span")).click();
		
		//enter invalid email id
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("neenu123");
		
		//click continue
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//navigate to the home page
		
		driver.navigate().back();
		
		//click mobile field
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();
		
		//click hamburger menu
		
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		
		
	}
	

}
