package Library;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;

public class InvokeBrowser {

public WebDriver driver;

	
@Parameters("Webbrowser")
	public void opentherequiredbrowser(String Webbrowser) throws IOException
	{
	if(Webbrowser.equals("Chrome"))	
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91950\\eclipse-workspace\\Eclipse workspace\\SAIL01\\BROWSER\\chromedriver.exe");
	driver = new ChromeDriver();	
	}
	else if (Webbrowser.equals("Edge"))
	{
	System.setProperty("webdriver.edge.driver","C:\\Users\\91950\\eclipse-workspace\\Eclipse workspace\\30july_maven1\\BROWSER\\msedgedriver.exe");	
		WebDriver driver = new EdgeDriver();	
	}

	driver.get(Utilities.Readdatafrompropertiesfile("UURRLL"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	
	
	
	
}
