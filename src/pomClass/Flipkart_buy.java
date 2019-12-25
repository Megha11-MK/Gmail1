package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_buy {

	@FindBy(xpath="(//div[.='Redmi 8A (Ocean Blue, 32 GB)'])[1]")
	private WebElement mobbuy;
	
	public Flipkart_buy(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clik()
	{
		mobbuy.click();
	}
}
