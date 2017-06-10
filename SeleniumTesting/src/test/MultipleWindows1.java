package test;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class MultipleWindows1 {
	
	 WebDriver driver;
	    
	 public MultipleWindows1(WebDriver driver) {
			this.driver=driver;
	}
	 
	 String parent;
	 public MultipleWindows1 goToDriverNewWindow(){
		   parent =driver.getWindowHandle();
		   System.out.println("Naslov prozora je : "+driver.getTitle());
			
			
			Set<String> s1=driver.getWindowHandles();		
			Iterator<String> i1=s1.iterator();
			
			while(i1.hasNext()){
				String child=i1.next();
				
				if(!parent.equals(child)){
					driver.switchTo().window(child);
					assertEquals("Nismo presli na novi window","http://the-internet.herokuapp.com/windows/new", driver.getCurrentUrl());
					System.out.println("Naslov novog prozora je : "+driver.getTitle());	
					driver.close();

				}			
			}
		 return this;
	 }
	 
	 public MultipleWindows backDriverFrstWindow(){
		 
		 driver.switchTo().window(parent);
		 System.out.println("Naslov prozora je : "+driver.getTitle());
		 return new MultipleWindows(driver);
	 }

}
