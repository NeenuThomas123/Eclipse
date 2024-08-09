package Testng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignmentamazon 
{
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void urlloading()
	{
		//open amazon site
		driver.get("https://www.amazon.in");
		
	}
	
	@Test
	public void test()
	{
		//search mobile phones
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phones");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		//title verification using assertion
		
		String expected="Amazon.in : mobile phones";
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual);
		System.out.println(driver.getTitle());
		
		//click first phone details
		
	    WebElement phone = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
	    System.out.println(phone.getText());
	    
	    String parentwindow=driver.getWindowHandle();
	    System.out.println("parent window is"+driver.getTitle());
	    
	    phone.click();
	    Set<String> allwindows = driver.getWindowHandles();
	    
	    for(String handle:allwindows)
	    {
	    	System.out.println(handle);
	    	if(!handle.equals(parentwindow))
	    	{
	    		driver.switchTo().window(handle);
	    		
	    		//click add to cart
	    		driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[4]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[38]/div[1]/span/span/span/input")).click();
	    		
	    	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	    	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")));
	    	    
	    	    //select cart
	    	    
	    	    driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
	    	}
	    }
		
		
		
	}
}
		
		
		
		
	