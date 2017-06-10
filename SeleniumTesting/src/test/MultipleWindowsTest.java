package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MultipleWindowsTest extends TestAbstract{
	
	@Before
	public void setUp(){
		start();
	}
	@After
	public void close(){
		end();
	}
	@Test
	public void testMultipleWindows(){
		
		MainClass mainClass=new MainClass(driver);
		MultipleWindows multipleWindows=mainClass.goToMultipleWindows();
		MultipleWindows1 multipleWindows1=multipleWindows.openNewWindow();
		multipleWindows1.goToDriverNewWindow();
		MultipleWindows windows=multipleWindows1.backDriverFrstWindow();
		windows.verificationBeck();
		
	}

}
