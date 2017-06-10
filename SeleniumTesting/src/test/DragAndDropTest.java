package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DragAndDropTest extends TestAbstract{
	
	
	@Before
	public void setUp(){
		start();
	}
	@After
	public void close(){
		end();
	}
	@Test
	public void testDragDrop() throws InterruptedException{
		
		MainClass mainClass=new MainClass(driver);
		DragAndDrop dragAndDrop=mainClass.goToDragAndDrop();
		dragAndDrop.drag_and_drop();
	}

}
