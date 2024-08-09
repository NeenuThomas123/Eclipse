package Testpkg;

import org.testng.annotations.Test;

import Basepkg.Baseclass;
import Pagepkg.Fbpage;
import Utilities.Excelutil;

public class Fbtest extends Baseclass
{
	@Test
	public void verifyloginwithvalidcred()
	{
		Fbpage p1=new Fbpage(driver);
		
		//reading the data from excel file by the specified path
		
		String x1="C:\\Users\\Neenu Thomas\\Desktop\\data.xlsx";
		
		String Sheet="Sheet1";
		
		int rowcount=Excelutil.getRowCount(x1,Sheet);
		
		for(int i=1;i<=rowcount;i++)
		{
			String Username=Excelutil.getCellValue(x1,Sheet,i,0);
			
			System.out.println("username-----"+Username);
			
			String pwd=Excelutil.getCellValue(x1,Sheet,i,1);
			
			System.out.println("password-----"+pwd);
			
			//passing username and password as parameters
			
			//submitting the data by clicking on login button
			
			//p1.setvalues("","");
			
			p1.setvalues(Username, pwd);
			
			p1.login();
			
			
		}
	}


}
