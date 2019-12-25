package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pomClass.GmailFetchTime;
import pomClass.GmailHomeCompose;
import pomClass.GmailLoginUn;
import pomClass.GmailSentitems;
import pomClass.GmailWelcome;

public class GmailTestScript {
	@Test
	
	public void testGmail() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver",
				"./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		GmailLoginUn lp= new GmailLoginUn(driver);
		lp.enterUn("meghaveerapur11@gmail.com");
		lp.clickon();
		
		Thread.sleep(3000);
		
		
		GmailWelcome wc=new GmailWelcome(driver);
		wc.enterpwd("7204721430");
		wc.clikon();
		
		Thread.sleep(3000);
		
		GmailHomeCompose cp=new GmailHomeCompose(driver);
		Thread.sleep(5000);
		cp.click();
		Thread.sleep(7000);
		cp.enterTo("meghaveerapur11@gmail.com");
		Thread.sleep(3000);
		cp.entersub("hi");
		Thread.sleep(3000);
		cp.enterbody("megha");
		Thread.sleep(3000);
		cp.clicko();
		Thread.sleep(5000);
		cp.sentklik();
		
		Thread.sleep(5000);
		
		GmailSentitems gs= new GmailSentitems(driver);
		gs.firstclik();
	
		
		Thread.sleep(5000);
		
		GmailFetchTime ft=new GmailFetchTime(driver);
		ft.gettime();
		
	}

}
