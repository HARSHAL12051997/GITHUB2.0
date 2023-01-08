package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_01_HOME {
WebDriver driver1;
@FindBy(xpath="(//a[text()=\"Home\"])[1]") private WebElement home;	
@FindBy(xpath="(//a[text()=\"Notification\"])[1]") private WebElement Notification;
@FindBy(xpath="(//a[text()=\"Sail Website\"])[1]")private WebElement Sailwebsite;
@FindBy(xpath="(//a[@class=\"main-search\"])[1]")private WebElement LOGIN;

public 	POM_01_HOME(WebDriver driver) 
{	
PageFactory.initElements(driver, this);	
driver1=driver;
}
public void selectonhome() throws InterruptedException
{

Thread.sleep(5000);
Notification.click();
driver1.navigate().back();
Thread.sleep(5000);
Sailwebsite.click();
//driver1.navigate().back();
//Thread.sleep(5000);
//LOGIN.click();
//Thread.sleep(5000);
//home.click();

}	
}
