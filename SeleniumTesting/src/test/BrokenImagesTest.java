package test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BrokenImagesTest extends TestAbstract{
	
	@Before
	public void setUp(){
		start();
	}
	@After
	public void close(){
		end();
	}
	@Test
	public void testBrokenImg() throws ClientProtocolException, IOException{
		MainClass mainClass=new MainClass(driver);
		BrokenImages brokenImages=mainClass.goBrokenImages();
		brokenImages.verifayBrokenImg();
	}

}
