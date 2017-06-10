package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainClass {
	
	WebDriver driver;
	
	public MainClass(WebDriver driver) {
		this.driver=driver;
	}
	
	public Dropdown goToDropDown(){		
		WebElement dropDown=driver.findElement(By.xpath("//a[text()='Dropdown']"));
		dropDown.click();
		return new Dropdown(driver);
	}
	
	public ContextMenu goToConetxtMenu(){		
		WebElement contextMenu=driver.findElement(By.xpath("//a[text()='Context Menu']"));
		contextMenu.click();		
		return new ContextMenu(driver);
	}
	public Checkboxes goToCheckBoxes(){		
		WebElement checkBox=driver.findElement(By.xpath("//a[text()='Checkboxes']"));
		checkBox.click();
		return new Checkboxes(driver);
	}
	
	public DisappearingElements goToDisappearingElements(){
		WebElement dElement=driver.findElement(By.linkText("Disappearing Elements"));
		dElement.click();
		return new DisappearingElements(driver);
	}
	
	public DynamicControls goToDynamicControls(){
		WebElement dElement=driver.findElement(By.linkText("Dynamic Controls"));
		dElement.click();
		return new DynamicControls(driver);
	}
	public KeyPresses goToKeyPresses(){
		WebElement webElement = driver.findElement(By.xpath("//a[text()='Key Presses']"));
		webElement.click();
		return new KeyPresses(driver);
	}
	public NotificationMessages goToNotificationMessages(){
		WebElement linkNM=driver.findElement(By.xpath("//a[text()='Notification Messages']"));
		linkNM.click();
		return new NotificationMessages(driver);
	}
    public Typos goToTypos(){
		WebElement linkTypos=driver.findElement(By.xpath("//a[text()='Typos']"));
		linkTypos.click();
		return new Typos(driver);
	}
    public MultipleWindows goToMultipleWindows(){
    	WebElement linkMW=driver.findElement(By.xpath("//a[text()='Multiple Windows']"));
		linkMW.click();   	
    	return new MultipleWindows(driver);
    }
    public Frames goToFrames(){    	
    	WebElement linkF=driver.findElement(By.linkText("Frames"));
		linkF.click();
    	return new Frames(driver);
    }
    public BasicAuth goBasicAuth(){    	
    	   	
        	WebElement basicAuth=driver.findElement(By.linkText("Basic Auth"));
    		basicAuth.click();
    	return new BasicAuth(driver);
    }
    public BrokenImages goBrokenImages(){    	
	   	
    	WebElement brokenImages=driver.findElement(By.linkText("Broken Images"));
    	brokenImages.click();
	return new BrokenImages(driver);
}
 public DynamicContent goToDynamicContent(){    	
	   	
    	WebElement brokenImages=driver.findElement(By.linkText("Dynamic Content"));
    	brokenImages.click();
	return new DynamicContent(driver);
}
 
 public DragAndDrop  goToDragAndDrop (){    	
	   	
 	WebElement dragAndDrop =driver.findElement(By.linkText("Drag and Drop"));
 	dragAndDrop.click();
	return new DragAndDrop (driver);
}



}
