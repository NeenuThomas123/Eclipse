package Testng;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Herbalassignment
{
	ChromeDriver driver;
	String baseurl="https://rishiherbalindia.linker.store/";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void urlloading()
	{
		//open the site
		
		driver.get("https://rishiherbalindia.linker.store/");
		
	}
	@Test
	public void test() throws InterruptedException, IOException
	{
		//click my account and register your details
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();

		//sign up
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[1]/input")).sendKeys("neenukaduvanal123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Neenutho123");
	    driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
	    driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
	   
	    Thread.sleep(5000);

	    
	    //click login button and login
	    
	   driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Neenutho123");
	   driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
	   
	   //search herbal agro growth booster in search bar
	   
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("herbal agro growth booster",Keys.ENTER);



	 
	   //click add to wishlist and add that product to your wishlist
	   
	   Thread.sleep(7000);
	   driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
	   driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]")).click();
	   
	   //click on link skin and add aloe faireness cream to your wishlist
	   
	   driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();
	   driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]")).click();
	   
	   //click 'all' link then click 'health' link after that click 'safety' link one after the other
	   
	   driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
	   driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
	   
	   //scroll down to the bottom of the page and click 'about us'
	   
	   Thread.sleep(5000);
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,1000)","");
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
	   
	   //take screenshot of the element 'privacy policy'
	   
	   WebElement wb = driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/a[2]"));
	   File src=wb.getScreenshotAs(OutputType.FILE);
	   FileHandler.copy(src, new File("./Screenshot//privacy.png"));
	   
	   //check the response code of the link 'https://www.rishiherbalindia.linker.store/
	   
	   URL ob=new URL(baseurl);
	   HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	   int code=con.getResponseCode();
	   System.out.println(code);
	   con.connect();
	   
	   if(con.getResponseCode()==200)
	   {
		   
		   System.out.println("valid url");
		   
	   }
	   else
	   {
		   
		   System.out.println("invalid url");
		   
	   }
	   
	   }
}
