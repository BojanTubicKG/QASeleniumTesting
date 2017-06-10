package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxesTest extends TestAbstract{
	
	@Before
	public void setUp(){
		start();
	}
	@After
	public void close(){
		end();
	}
	@Test
	public void testCheckBoxes(){
		
		MainClass mainClass=new MainClass(driver);
		Checkboxes checkboxes=mainClass.goToCheckBoxes();
		
		WebElement checkBox1=driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		WebElement checkBox2=driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
		
		checkboxes.defaultVerification().selectCheckBox(checkBox1,true).verificationCheckBox(checkBox1,true);		
	}

}
