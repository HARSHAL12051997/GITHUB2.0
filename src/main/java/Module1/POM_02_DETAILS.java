package Module1;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;

    public class POM_02_DETAILS {

	@FindBy(xpath="//footer[@class=\"footer container\"]") private WebElement FOOTERLIST;
	WebDriver driver1; 
	public POM_02_DETAILS(WebDriver driver) 
	{
		
	PageFactory.initElements(driver, this);	
	driver1=driver;	
	}
	public void footerdetails() 
	{
		String act = null;
		String exp = "Buy SAIL steel";
		List<WebElement> footerlist = driver1.findElements(By.xpath("footer[@class='footer container']"));	
			for(WebElement s1:footerlist) 
			{
				 act = s1.getText();
				if(act.equals(exp))
				{
				s1.click();	
				}
			}
		
		Assert.assertEquals(exp, act,"Failed:both result are different");
		
	}
	
}
