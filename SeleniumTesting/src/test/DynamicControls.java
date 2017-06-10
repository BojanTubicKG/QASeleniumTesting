package test;

import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControls {
	
    WebDriver driver;

	public DynamicControls(WebDriver driver) {
		this.driver=driver;
	}
	

	static WebDriverWait wait;
	WebElement cBox;
	
	public DynamicControls verificationCheckBoxNotCheck(){	
	    cBox=driver.findElement(By.xpath("//input[@id='checkbox']")); 
	    assertNull(cBox.getAttribute("checked"));
		System.out.println("CheckBox nije cekiran po difoltu");
		return this;
	}	
	public DynamicControls checkBoxCheck(){
		cBox.click();
		assertNotNull(cBox.getAttribute("checked"));
		System.out.println("CheckBox je cekiran");
		return this;
	}	
	public void removeCheckBox(){
		
		WebElement rem=driver.findElement(By.xpath("//button[@id='btn']"));
		rem.click();	
		
		wait = new WebDriverWait(driver, 20);
		By loading = By.xpath("//div[@id='loading']");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loading));
	}		
}
