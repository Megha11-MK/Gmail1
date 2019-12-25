package generic_lib;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//import java.awt;
//import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

public class BrowserActions {
	
	static Robot r;
	static{
	try {
		r=new Robot();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
public void maximize_action(WebDriver driver)
{
driver.manage().window().maximize();	
}
public void minimize()
{

{
	
	try{
		
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_N);
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyPress(KeyEvent.VK_N);
	
}
	catch(Exception e)
	{

	}
}}
public void new_tab()
{


try{
	
r.keyPress(KeyEvent.VK_T);
r.keyRelease(KeyEvent.VK_T);
}
catch(Exception e){
	}
}
	




}


