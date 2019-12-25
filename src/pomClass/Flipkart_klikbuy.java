package pomClass;

import java.util.Set;

import generic_lib.GenericWebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_klikbuy {
	
	@FindBy(xpath="//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement buyit;
	
	public Flipkart_klikbuy(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void switchit(WebDriver driver)
	{
		Set<String> allwi = driver.getWindowHandles();
		for(String wh:allwi){
	GenericWebDriverMethods ge= new GenericWebDriverMethods();
	ge.switch_it(driver, wh);
		}
		
	
	
	}
	
	
	public void buym()
	{
		buyit.click();
	}

}
