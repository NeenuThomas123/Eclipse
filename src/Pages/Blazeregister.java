package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blazeregister 
{
	WebDriver driver;
	
	@FindBy(id="name")
	WebElement bzname;
	
	@FindBy(id="company")
	WebElement bzcomp;
	
	@FindBy(id="email")
	WebElement bzemail;
	
	@FindBy(id="password")
	WebElement bzpass;
	
	@FindBy(id="password-confirm")
	WebElement bzconfpass;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button")
	WebElement bzregister;
	
	public Blazeregister(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void setvalues(String name,String company,String email,String password,String confirmpassword)
	{
		
		bzname.sendKeys(name);
		bzcomp.sendKeys(company);
		bzemail.sendKeys(email);
		bzpass.sendKeys(password);
		bzconfpass.sendKeys(confirmpassword);
		
	}
	
	public void register()
	{
		
		bzregister.click();
		
	}
	

}
