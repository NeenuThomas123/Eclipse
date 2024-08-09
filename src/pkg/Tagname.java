package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname 
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
	}
	@Test
	public void test()
	{
		List<WebElement> li = driver.findElements(By.tagName("a"));
		
		System.out.println("link count"+li.size());
		
		//to enhance the link details and also print the link details
		for(WebElement s:li)
		{
			// href is an attribute
			String link=s.getAttribute("href");
			
			String text=s.getText();
			
			System.out.println(link+" "+text);
			
		}
		
	}

}
