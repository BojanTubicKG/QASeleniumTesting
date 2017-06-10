package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DynamicContentTest extends TestAbstract{
	
	@Before
	public void setUp(){
		start();
	}
	@After
	public void close(){
		end();
	}
	@Test
	public void testDynamicContent(){
		
		MainClass mainClass=new MainClass(driver);
		DynamicContent content=mainClass.goToDynamicContent();
		content.promene();
	}
	

}
