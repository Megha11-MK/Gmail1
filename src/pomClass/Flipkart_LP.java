package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_LP {
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement mobtbox;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement psdtbox;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	private WebElement loginbutn;
	
	public Flipkart_LP(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void entermob(String mob)
	{
		mobtbox.sendKeys("8746061279");
	}
	public void enterpsd(String psd)
	{
		psdtbox.sendKeys("kubermegha");
	}
	public void clickon()
	{
		loginbutn.click();
	}
	

}
