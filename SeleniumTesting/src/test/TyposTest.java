package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TyposTest extends TestAbstract{
	
	@Before
	public void setUp(){
		start();
	}
	@After
	public void close(){
		end();
	}
	@Test
	public void testTypos(){
		MainClass mainClass=new MainClass(driver);
		Typos typos=mainClass.goToTypos();
		typos.typos();
	}

}
