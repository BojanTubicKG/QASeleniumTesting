package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DynamicControlsTest extends TestAbstract{
	
	@Before
	public void setUp(){
		start();
	}
	@After
	public void close(){
		end();
	}
	@Test
	public void testDynanicControls(){
		
		MainClass mainClass=new MainClass(driver);
		DynamicControls controls=mainClass.goToDynamicControls();
		controls.verificationCheckBoxNotCheck().checkBoxCheck().removeCheckBox();
		
	}

}
