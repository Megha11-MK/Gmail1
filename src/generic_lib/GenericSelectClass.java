package generic_lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericSelectClass {
	
	public void selectIndex(WebElement ele, int a)
	{
		Select s=new Select(ele);
		s.selectByIndex(a);
	}
	public void selectValue(WebElement ele, String val)
	{
		Select s=new Select(ele);
		s.selectByValue(val);
	}
	public void selectVisibleText(WebElement ele,String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);
		
	}
	public void selectedOptions(WebElement ele)
	{
		Select s = new Select(ele);
		s.getAllSelectedOptions();
	}
	public void firstSelectedOption(WebElement ele)
	{
		Select s=new Select(ele);
		s.getFirstSelectedOption();
	}
	public void getOptions(WebElement ele)
	{
		Select s = new Select(ele);
		s.getOptions();
	}
	public void isMultiple(WebElement ele)
	{
		Select s = new Select(ele);
		s.isMultiple();
	}
	public void deselectAll(WebElement ele)
	{
		Select s = new Select(ele);
		s.deselectAll();
	}
	public void deselectIndex(WebElement ele, int m)
	{
		Select s=new Select(ele);
		s.deselectByIndex(m);
	}
	public void deselectValue(WebElement ele, String val)
	{
		Select s= new Select(ele);
		s.deselectByValue(val);
	}
	public void deselectVisibleText(WebElement ele, String text)
	{
		Select s = new Select(ele);
		s.deselectByVisibleText(text);
	}


	public static void main(String[] args) {
		

	}

}
