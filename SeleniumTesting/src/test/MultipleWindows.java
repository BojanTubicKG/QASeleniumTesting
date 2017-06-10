package test;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleWindows {
	
	
    WebDriver driver;
    
    public MultipleWindows(WebDriver driver) {
		this.driver=driver;
	}

	public MultipleWindows1 openNewWindow(){
		
		WebElement open=driver.findElement(By.xpath("//a[text()='Click Here']"));	
		open.click();
		return new MultipleWindows1(driver);
   }	
	
	public void verificationBeck(){
	
			assertEquals("Nismo se vratili na roditeljski window","http://the-internet.herokuapp.com/windows", driver.getCurrentUrl());
	}
}
