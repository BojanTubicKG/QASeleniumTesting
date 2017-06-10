package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicContent {
	
WebDriver driver;
	
	public DynamicContent(WebDriver driver) {
		this.driver=driver;
	}
	
 public void promene(){
		 
		 for (int i = 1; i < 6; i++) {
			System.out.println("UCITAVANJE BROJ "+i);
			
		System.out.println("SLIKE : ");	
		List<WebElement> img = driver.findElements(By.xpath("//div[@class='large-2 columns']/img"));
		for (WebElement webElement : img) {
		String ss = webElement.getAttribute("src");
		System.out.println(ss);
		}
		
		System.out.println("TEXT : ");
		List<WebElement> text = driver.findElements(By.xpath("//div[@class='large-10 columns']"));
	    for (WebElement webElement1 : text) {
				System.out.println(webElement1.getText());
			}
			 driver.navigate().refresh();
			 System.out.println("\n");
		 }
	 }

}
