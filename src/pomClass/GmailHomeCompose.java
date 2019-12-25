package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailHomeCompose {
	@FindBy(xpath="//div[@class='T-I J-J5-Ji T-I-KE L3']")
	private WebElement composebtn;
	
	@FindBy(xpath="//textarea[@rows='1']")
	private WebElement tofield;
	
	@FindBy(xpath="//input[@name='subjectbox']")
	private WebElement subfield;
	
	@FindBy(xpath="//div[@class='Am Al editable LW-avf tS-tW']")
	private WebElement bodyfield;
	
	@FindBy(xpath="//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")
	private WebElement sendbtn;
	
	@FindBy(xpath="(//div[@class='aio UKr6le'])[4]")
	private WebElement sentitemsbtn;
	
	public GmailHomeCompose(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click()
	{
		composebtn.click();
	}
	public void enterTo(String to)
	{
		tofield.sendKeys(to);
	}
	public void entersub(String sub)
	{
		subfield.sendKeys(sub);
	}
	public void enterbody(String bo)
	{
		bodyfield.sendKeys(bo);
	}
	public void clicko()
	{
		sendbtn.click();
	}
	public void sentklik()
	{
		sentitemsbtn.click();
	}

}
