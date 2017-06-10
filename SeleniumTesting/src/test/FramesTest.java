package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FramesTest extends TestAbstract{
	
	@Before
	public void setUp(){
		start();
	}
	@After
	public void close(){
		end();
	}
	@Test
	public void testFrames(){
		
	MainClass mainClass=new MainClass(driver);
	Frames frames=mainClass.goToFrames();
	FramesIFrame framesIFrame=frames.goToIFrame();
	framesIFrame.verificatioDefoltText().writeText("Hello world").verifyWritenText().clickToBold().writeBold("Bojan").verifyBoldText().clickItalic()
	.writeItalicText("Tubic ").verifyItalicText().clickRightSort().writeTextRight("Kragujevac ").verifyRightcText().clickCentarText().writeCentarRight("Srbija ").verifyCentarText();
		
	}

}
