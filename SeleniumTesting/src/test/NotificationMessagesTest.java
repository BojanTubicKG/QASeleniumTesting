package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NotificationMessagesTest extends TestAbstract{
	
	@Before
	public void setUp(){
		start();
	}
	@After
	public void close(){
		end();
	}
	@Test
	public void testNotificationMessages(){
		
		MainClass mainClass=new MainClass(driver);
		NotificationMessages messages=mainClass.goToNotificationMessages();
		messages.notificationMessages();
		
	}

}
