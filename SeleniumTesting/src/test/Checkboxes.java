package test;

import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkboxes {
	
	WebDriver driver;
	
	public Checkboxes(WebDriver driver) {
		this.driver=driver;
	}
	
	WebElement checkBox1;
	WebElement checkBox2;
	
	public Checkboxes defaultVerification(){
	 checkBox1=driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));		
	 checkBox2=driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
		
	  assertNull("Check box1 je cekiran po difoltu",checkBox1.getAttribute("checked"));		
	  assertNotNull("Checkbox2 nije cekiram po difoltu",checkBox2.getAttribute("checked"));		
		return this;

	}	
	
	public Checkboxes selectCheckBox(WebElement element,boolean value){
		
		boolean getCurentState = element.isSelected();
		
        if(value!=getCurentState){
              element.click();
         }		
		return this;		
	}
	
	
	static WebElement provera;
	public void verificationCheckBox(WebElement element,boolean ocekivanaVrednost){
		provera=element;
		
		
		boolean getCurentState = Checkboxes.isCheced();
		
		assertEquals("Ocekivana vrednost nije dobra",getCurentState, ocekivanaVrednost);
	
	}
	static boolean isCheced(){
		boolean povVrednost=false;
		
		if(provera.getAttribute("checked")!=null){
			povVrednost=true;
		}
		
		return povVrednost;
	}
}

