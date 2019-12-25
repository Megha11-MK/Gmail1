package generic_lib;

import org.openqa.selenium.WebDriver;

public class GenericWebDriverMethods {

	public void close_it(WebDriver driver) {
		driver.close();

	}
	public void get_currentURL(WebDriver driver)
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	public void pageSource(WebDriver driver)
	{
		String src = driver.getPageSource();
		System.out.println(src);
	}
	public void tiTle(WebDriver driver)
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	public void handlewindow(WebDriver driver)
	{
		driver.getWindowHandle();
	}
	public void handlewindows(WebDriver driver)
	{
		driver.getWindowHandles();
	}
	public void mana_ge(WebDriver driver)
	{
		driver.manage();
	}
	public void navi_gate(WebDriver driver)
	{
		driver.navigate();
	}
	public void qu_it(WebDriver driver)
	{
		driver.quit();
	}
	public void switch_it(WebDriver driver, String wh)
	{
		driver.switchTo().window(wh);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
