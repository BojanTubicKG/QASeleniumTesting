package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DisappearingElementsTest extends TestAbstract{

	@Before
	public void setUp(){
		start();
	}
	@After
	public void close(){
		end();
	}
	@Test
	public void testDisappearingElementsTest(){
		MainClass mainClass=new MainClass(driver);
		DisappearingElements disappearingElements=mainClass.goToDisappearingElements();
		disappearingElements.refreshDisappearingElements();
		
	}
	
}
