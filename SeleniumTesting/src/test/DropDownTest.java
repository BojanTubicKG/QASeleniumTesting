package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DropDownTest extends TestAbstract{
	
	@Before
	public void setUp(){
		start();
	}
	@After
	public void close(){
		end();
	}
	
	@Test
	public void testDropDown(){
		
		MainClass mainClass=new MainClass(driver);
		Dropdown dropdown=mainClass.goToDropDown();
		dropdown.verificationFrstSelectOption().selectOption("Option 2").veryfaySelect();
	}

}
