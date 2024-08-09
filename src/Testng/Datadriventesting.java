package Testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventesting 
{
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		//ChromeOptions=new ChromeOptions();
		//options.addArguments("---remote---allow-origins=*");
		//driver=new ChromDriver(options);
		
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test() throws IOException  
	{
		File f=new File("C:\\Users\\Neenu Thomas\\Desktop\\data.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
{
			String Username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Username="+Username);
			
			String Password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(Password);
			

		driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(Username);
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(Password);
		
		driver.findElement(By.name("login")).click();
		
		
	}

	
	
	String actualurl=driver.getCurrentUrl();
	System.out.println(actualurl);
	
	//String expurl="https://www.facebook.com"
	
	String expurl="https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348092";
	
	if(expurl.equals(expurl))
	{
		System.out.println("login successful");
	}
	else
	{
		System.out.println("login failed");
	}
	
	
	
}
}
