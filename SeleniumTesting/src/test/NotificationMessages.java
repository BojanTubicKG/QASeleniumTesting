package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotificationMessages {
	
WebDriver driver;
	
	public NotificationMessages(WebDriver driver) {
		this.driver=driver;
	}
	
	public void notificationMessages(){
	
	for (int i = 1; i < 11; i++) {
		
		
		
		WebElement text=driver.findElement(By.xpath("//div[@id='flash']"));
		System.out.println("Poruka obavestenja broj "+i+" je : "+text.getText());
		
		WebElement newM=driver.findElement(By.xpath("//a[text()='Click here']"));
		newM.click();
	}
  }

}
