package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Typos {
	
    WebDriver driver;
    
    public Typos(WebDriver driver) {
		this.driver=driver;
	}
	
	public void typos(){	
	
	for (int i = 1; i < 11; i++) {
			
		WebElement text=driver.findElement(By.xpath("//div[@id='content']//p[2]"));
		String textString=text.getText();
		
		System.out.println("Ucitavanje broj "+i+" , text je : "+textString);		
		driver.navigate().refresh();
	
		}
	}

}
