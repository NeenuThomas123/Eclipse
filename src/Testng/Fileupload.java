package Testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload 
{
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.ilovepdf.com/pdf_to_word");
	}
	@Test
	public void test() throws AWTException, InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		
		fileUpload("C:\\Users\\Neenu Thomas\\Downloads\\NEENU-THOMAS-FlowCV-Resume-2024pdf (1)");
		
	}
	public void fileUpload(String p) throws AWTException, InterruptedException
	{
		//to copy path to clipboard
		StringSelection strSelection=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		//to paste into system window
		Robot robot=new Robot();
		robot.delay(1000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		//Thread.sleep(5000);
		
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
