package test;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicAuthTest extends TestAbstract{
	
	@Before
	public void setUp(){
		start();
	}
	@After
	public void close(){
		end();
	}
	@Test
	public void testBasicAuth() throws IOException{
		
		MainClass mainClass=new MainClass(driver);
		BasicAuth auth=mainClass.goBasicAuth();
		auth.sentUserPass("admin", "admin");
		
	}

}
