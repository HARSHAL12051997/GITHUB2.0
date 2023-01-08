package MODULE_01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library.InvokeBrowser;
import Library.Utilities;
import Module1.POM_01_HOME;
import Module1.POM_02_DETAILS;


      public class TESTCLASS_01 extends InvokeBrowser
      {
      POM_01_HOME PMH ;
      POM_02_DETAILS PMD;
      int TCID;
      @BeforeClass
      public void openbrowser() throws IOException 
     {
	 opentherequiredbrowser("Chrome");
     }
	
	
     @BeforeMethod	
     public void invokebrowser1() throws IOException 
     {	
     PMH= new POM_01_HOME(driver);
     PMD = new POM_02_DETAILS(driver);	
     }	
	@Test(priority = 0)
     public void TC_01() throws InterruptedException {
	 TCID=01;
     Thread.sleep(3000);
     PMH.selectonhome();
     }
	
	@Test (priority=1)
	public void click_on_footer() 
	{
	TCID =02;
	PMD.footerdetails();
	}
	
	
	@AfterMethod
	public void logoutFromApp(ITestResult s1) throws IOException
	{
	if(s1.getStatus()==ITestResult.FAILURE)
	{
	Utilities.TakeSS(driver,TCID);
	}		
	}
	
	@AfterClass
	public void closebrowser() 
	{
		driver.close();
		
	}
	
}
