package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blazelogin
{
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement bzemail;
	
	@FindBy(id="password")
	WebElement bzpassword;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button")
	WebElement bzlogin;
	
	public Blazelogin(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	
	public void setvalues(String email,String password)
	{
		
		bzemail.sendKeys(email);
		bzpassword.sendKeys(password);
		
	}
	
	public void login()
	{
		
		bzlogin.click();
		
	}

}
