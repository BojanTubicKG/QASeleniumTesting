package test;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPresses {
	
    WebDriver driver;
	
	public KeyPresses(WebDriver driver) {
		this.driver=driver;
	}
		 
    //Keys[] key={Keys.SPACE,Keys.DOWN,Keys.ARROW_UP,Keys.BACK_SPACE,Keys.CLEAR,Keys.TAB,Keys.CONTROL,Keys.SHIFT,Keys.ENTER,Keys.ARROW_DOWN};
    
    WebElement sent;
    String t;
    String text;
    
    Keys key1;
    
   public KeyPresses keyPresses(Keys key){
	   sent = driver.findElement(By.xpath("//body"));		 
	   sent.sendKeys(key);	
	   key1=key;
	   return this; 
   }
   
   public void verificationKeysPresses(){
	   
	   WebElement result=driver.findElement(By.xpath("//p[@id='result']"));
	   String resultString=result.getText();
		 
		 text=resultString.substring(13);
		 System.out.println("Uneo si :"+text);
		 
		  t=key1.name();
		 
		 //imena ovih enumeracija se ne poklapaju ,morao sam ovako .
		 switch(t){
		 case "ARROW_LEFT":
			 t="LEFT";
			 break;
		 case "ARROW_RIGHT":
			 t="RIGHT";
			 break;
		 case "ARROW_UP":
			 t="UP";
			 break;
		 case "ARROW_DOWN":
			 t="DOWN";
			 break;
		 }		
		 assertEquals("Nije dobar uneti Key presses",t, text); 
	   
   }
    	
    
    /*public void keyPresessAndVerification(){	 
	for (int i = 0; i < key.length; i++) {
		
	 
		 sent = driver.findElement(By.xpath("//body"));		 
		 sent.sendKeys(key[i]);		
		 
		 WebElement result=driver.findElement(By.xpath("//p[@id='result']"));
		 String resultString=result.getText();
		 
		 text=resultString.substring(13);
		 System.out.println("Uneo si :"+text);
		 
		  t=key[i].name();
		 
		 //imena ovih enumeracija se ne poklapaju ,morao sam ovako .
		 switch(t){
		 case "ARROW_LEFT":
			 t="LEFT";
			 break;
		 case "ARROW_RIGHT":
			 t="RIGHT";
			 break;
		 case "ARROW_UP":
			 t="UP";
			 break;
		 case "ARROW_DOWN":
			 t="DOWN";
			 break;
		 }		
		 assertEquals("Nije dobar uneti Key presses",t, text);  		
  }*/
 }   

