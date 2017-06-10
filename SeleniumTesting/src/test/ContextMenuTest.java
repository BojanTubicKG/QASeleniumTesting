package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ContextMenuTest extends TestAbstract{
	
	@Before
	public void setUp(){
		start();
	}
	@After
	public void close(){
		end();
	}
	@Test
	public void testContexMenu(){
		MainClass mainClass=new MainClass(driver);
		ContextMenu contextMenu=mainClass.goToConetxtMenu();
		contextMenu.openContextMenu();
		
	}

}
