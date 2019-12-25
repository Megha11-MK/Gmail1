package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailSentitems {
	
	@FindBy(xpath="(//div/table/tbody/tr[1]/td[5])[3]")
	private WebElement firstone;
	
	
	public GmailSentitems(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void firstclik()
	{
		firstone.click();
	}
	//public void inbclik()
	//{
		//inboxclik.click();
	//}

}
