package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class DragAndDrop {
	
WebDriver driver;
	
	public DragAndDrop(WebDriver driver) {
		this.driver=driver;
	}
	
	 public void drag_and_drop() throws InterruptedException{
		 
		  WebElement drag=driver.findElement(By.xpath("//div[@id='column-a']"));		 
		  WebElement drop=driver.findElement(By.xpath("//div[@id='column-b']"));
		  ;
		 
		  Actions act=new Actions(driver);   
		  act.clickAndHold(drag).moveToElement(drop).release(drop).build();
		  act.perform();
		  // Thread.sleep(2000);
		  // Actions dragAndDrop = new Actions(driver);
	      // Action action = dragAndDrop.dragAndDrop(drag, drop).build();
	      // action.perform();

	 }

}
