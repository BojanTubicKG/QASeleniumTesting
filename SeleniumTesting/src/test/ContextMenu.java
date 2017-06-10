package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {
	
    WebDriver driver;
	
	public ContextMenu(WebDriver driver) {
		this.driver=driver;
	}
	
	public void openContextMenu(){
    	WebElement element=driver.findElement(By.xpath("//div[@id='hot-spot']"));   	
    	Actions act =new Actions(driver);
    	act.contextClick(element).build().perform();
	}
}
