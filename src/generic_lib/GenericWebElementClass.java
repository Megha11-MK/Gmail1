package generic_lib;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericWebElementClass {
	
	public void clear(WebElement ele)
	{
		ele.clear();
	}
	public void click(WebElement ele)
	{
		ele.click();
	}
	public void findElement(WebDriver driver, WebElement ele)
	{
		driver.findElement((By) ele);
	}
	public void findElements(WebDriver driver, WebElement ele)
	{
		driver.findElements((By) ele);
	}
	public String getAtribute(WebElement ele, String atr)
	{
		String atri = ele.getAttribute(atr);
		System.out.println(atri);
		
		return atri;
	}
	public String cssValue(WebElement ele, String val)
	{
		String css = ele.getCssValue(val);
		System.out.println(css);
		
		return css;
	}
	public void location(WebElement ele)
	{
		Point loc = ele.getLocation();
		System.out.println(loc);
	}
	public void size(WebElement ele)
	{
	     ele.getSize();
	}
	public void tagName(WebElement ele)
	{
		ele.getTagName();
	}
	public String text(WebElement ele)
	{
		String te = ele.getText();
		System.out.println(te);
		return te;
	}
	public void isDisplayed(WebElement ele)
	{
		ele.isDisplayed();
	}
	public void isSelected(WebElement ele)
	{
		ele.isSelected();
	}
	public void isEnabled(WebElement ele)
	{
		ele.isEnabled();
	}
	public void passData(WebElement ele, String data)
	{
		ele.sendKeys(data);
	}
	public void submit(WebElement ele)
	{
		ele.submit();
	}
	public static void main(String[] args) {
		

	}

}
