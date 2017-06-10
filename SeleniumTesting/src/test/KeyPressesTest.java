package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;

public class KeyPressesTest extends TestAbstract{
	
	@Before
	public void setUp(){
		start();
	}
	@After
	public void close(){
		end();
	}
	@Test
	public void testKeyPresses(){
		
		MainClass mainClass=new MainClass(driver);
		KeyPresses keyPresses=mainClass.goToKeyPresses();
		keyPresses.keyPresses(Keys.ADD).verificationKeysPresses();
		
	}

}
