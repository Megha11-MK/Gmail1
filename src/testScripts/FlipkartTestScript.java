package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pomClass.Flipkart_HP;
import pomClass.Flipkart_LP;
import pomClass.Flipkart_buy;
import pomClass.Flipkart_klikbuy;
import pomClass.Flipkart_logout;

public class FlipkartTestScript {
	@Test
	public void testFlipkart() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver",
				"./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		Flipkart_LP lp= new Flipkart_LP(driver);
		Thread.sleep(5000);
		lp.entermob("8746061279");
		lp.enterpsd("kubermegha");
		lp.clickon();
		Thread.sleep(5000);
		
		Flipkart_HP hp=new Flipkart_HP(driver);
		hp.move(driver);
		Thread.sleep(3000);
		hp.klik();

		Thread.sleep(3000);
		
		Flipkart_buy by=new Flipkart_buy(driver);
		by.clik();
		
		Thread.sleep(5000);
		
		Flipkart_klikbuy bu= new Flipkart_klikbuy(driver);
		bu.switchit(driver);
		bu.buym();
		
		Thread.sleep(5000);
		
		Flipkart_logout fl=new Flipkart_logout(driver);
		fl.overact(driver);
		Thread.sleep(2000);
		fl.logout(driver);
		
	}

}
