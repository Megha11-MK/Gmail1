package generic_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GenericActionClass {
	
	public void rightClick(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	public void dragAndDrop(WebDriver driver, WebElement src,WebElement dest)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}
	public void doubleClick(WebDriver driver, WebElement ele)
	{
		Actions a =new Actions(driver);
		a.doubleClick(ele).perform();
	}
	public void mouseHoverAction(WebDriver driver, WebElement ele)
	{
		Actions a =new Actions(driver);
		a.moveToElement(ele).perform();
	}
	

	public static void main(String[] args) {
		

	}

}
