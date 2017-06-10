package test;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DisappearingElements {
	
	WebDriver driver;
	
	public DisappearingElements(WebDriver driver) {
		this.driver=driver;
	}
		
	public void refreshDisappearingElements(){
		
		for (int i = 1; i < 11; i++) {
					
		List<WebElement> lista=driver.findElements(By.xpath("//li/a"));
		
		System.out.println("Ucitavanje broj "+i);
		
		int broj=lista.size();
		System.out.println("Broj svih kontrola je : "+broj);
		System.out.println("Lista svih kontrola je : ");
		
		for(WebElement list:lista){
			
			String ime=list.getText();
			System.out.println(ime);
			
		}
		System.out.println("\n");		
		driver.navigate().refresh();
		
		}
	}
}
