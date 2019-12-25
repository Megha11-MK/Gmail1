package pomClass;

import generic_lib.GenericActionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_HP {
	@FindBy(xpath="(//span[@class='_1QZ6fC _3Lgyp8'])[1]")
	private WebElement electronics;
	
	@FindBy(xpath="(//a[.='Mi'])[1]")
	private WebElement redmi;
	
	public Flipkart_HP(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void move(WebDriver driver)
	{
		GenericActionClass g= new GenericActionClass();
		g.mouseHoverAction(driver, electronics);
	}
	public void klik()
	{
		redmi.click();
	}

}
