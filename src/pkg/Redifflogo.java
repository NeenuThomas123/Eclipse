package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifflogo
{
	ChromeDriver driver;
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		WebElement src = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		
		boolean b=src.isDisplayed();
		
		if(b==true)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
	}
		@Test
		public void test1()
		{
			WebElement ad = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
			
			boolean bo=ad.isSelected();
			
			if(bo==true)
			{
				System.out.println("box is checked");
			
		}
			else
			{
				System.out.println("box is unchecked");
			}
	}
		@Test
		public void test2()
		{
			WebElement ma = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
			
			boolean bl=ma.isSelected();
			
			if(bl==true)
			{
				System.out.println("selected");
			}
			else
			{
				System.out.println("not selected");
			}
		}

}
