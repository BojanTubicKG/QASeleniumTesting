package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames {
	
    WebDriver driver;
    
    public Frames(WebDriver driver) {
		this.driver=driver;
	}
	
    
    public FramesIFrame goToIFrame(){
    	WebElement linkIF=driver.findElement(By.xpath("//a[text()='iFrame']"));
		linkIF.click();
		return new FramesIFrame(driver);
    }
}
