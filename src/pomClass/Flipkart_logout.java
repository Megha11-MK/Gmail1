package pomClass;

import generic_lib.GenericActionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_logout {
	
	@FindBy(xpath="(//div[.='My Account'])[1]")
	private WebElement myaccountdd;
	
	@FindBy(xpath="//li[10]/a/div")
	private WebElement logoutbt;
	
	public Flipkart_logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 public void overact(WebDriver driver)
	 {
		 GenericActionClass ga=new GenericActionClass();
		 ga.mouseHoverAction(driver, myaccountdd);
	 }
	 public void logout(WebDriver driver)
	 {
		 logoutbt.click();
	 }

}
