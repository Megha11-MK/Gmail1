package generic_lib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Test extends GenericPhotoScreenshot {

	public WebDriver driver;

	@BeforeMethod
	public void openApp() {
		System.setProperty("webdriver.gecko.driver",
				"./drivers/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("");
	}
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
		int status = res.getStatus();
		if(status==2)
		{
			getphoto(driver);
		}
		driver.quit();
	}

}
