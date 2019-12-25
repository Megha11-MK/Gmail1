package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailWelcome {
	@FindBy(xpath="//input[@class='whsOnd zHQkBf']")
	private WebElement pwdtbox;
	
	@FindBy(xpath="(//span[.='Next'])[2]")
	private WebElement nextbutn;
	
	public  GmailWelcome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterpwd(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	public void clikon()
	{
		nextbutn.click();
	}

}
