package test;

import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown{
	
   WebDriver driver;
   
   public Dropdown(WebDriver driver) {
	 this.driver=driver;
   }  
   
   WebElement elDropDown;
   Select select;
   public Dropdown verificationFrstSelectOption(){
	    elDropDown=driver.findElement(By.xpath("//select[@id='dropdown']"));
		elDropDown.click();
   
	    select=new Select(elDropDown);	
		WebElement defaultOption=select.getFirstSelectedOption();
		String selectOption=defaultOption.getText();
		assertEquals("Nije dobra difoltno selektovana opcija","Please select an option", selectOption);
		return this;
   }
  String option1;
  
  public Dropdown selectOption(String selectOption){

	  select.selectByVisibleText(selectOption);
 
	  option1=selectOption;
   return this;	
  }
  
 
 public void veryfaySelect(){	  
			
	 String option=select.getFirstSelectedOption().getText();
     assertEquals("Nije dobra selektovana opcija",option1, option);

		  
	  }
  }

