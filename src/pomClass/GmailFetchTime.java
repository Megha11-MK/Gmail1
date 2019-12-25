package pomClass;

import generic_lib.GenericWebElementClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailFetchTime {
	
	
	@FindBy(xpath="//td[@class='gH bAk']/div/span[2]")
	private WebElement time;
	
	public GmailFetchTime(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void gettime()
	{
		GenericWebElementClass gw= new GenericWebElementClass();
		gw.text(time);
		
		
	}

}
