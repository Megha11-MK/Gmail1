package pomClass;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginUn {
	@FindBy(id = "identifierId")
	private WebElement username;

	@FindBy(xpath = "(//span[.='Next'])[1]")
	private WebElement nextbtn;

	public GmailLoginUn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterUn(String Un) {
		username.sendKeys(Un);
	}

	public void clickon() {
		nextbtn.click();
	}

}
