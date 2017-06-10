package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

public class FramesIFrame {
	
	 WebDriver driver;
	    
	 public FramesIFrame(WebDriver driver) {
			this.driver=driver;
		}
	 
	 
	 WebElement iframe;
	 WebElement text;
	 public FramesIFrame verificatioDefoltText(){
		 
		    iframe=driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));   	 
	    	driver.switchTo().frame(iframe);
	    	System.out.println("Presli smo na frame : "+iframe.toString());   	
	    	 
	    	text=driver.findElement(By.id("tinymce"));
	    	
	    	String textDefault=text.getText();
	    	System.out.println("Difoltni text je : "+textDefault);
	    	assertEquals("Nije dobar difoltni text","Your content goes here.", textDefault);
		 return this;
	 }
	 String textProvera;
	 public FramesIFrame writeText(String text1){
		 textProvera=text1;
		 text.clear();
	     text.sendKeys(text1);		 
		 return this;
	 }
	 public FramesIFrame verifyWritenText(){
		 
		    String textOption=text.getText();
	    	System.out.println("Upisani text je : "+textOption);
	    	assertEquals("Nije dobar uneti text",textProvera, textOption);
	    	text.clear();
	    	
	    	driver.switchTo().defaultContent();	    	
	    	System.out.println("\n");
	    	
		 return this;
	 }
	 public FramesIFrame clickToBold(){
		 WebElement bold=driver.findElement(By.xpath("//div[@id='mceu_3']/button"));
	     bold.click();
		 return this;
	 }
	 WebElement boldText;
	 String boldProvera;
	 public FramesIFrame writeBold(String textB){
		    driver.switchTo().frame(iframe);
	        boldText=driver.findElement(By.id("tinymce"));
	        boldProvera=textB;
	    	boldText.sendKeys(textB);
		 return this;
	 }
	 public FramesIFrame verifyBoldText(){
		 String boldText1=boldText.getText();
		 assertEquals("Text nije boldiran",boldProvera, boldText1);
		 System.out.println("Uneti boldirani text je : "+boldText1);
		 boldText.clear();
		 driver.switchTo().defaultContent();
		 return this;
	 }
	 public FramesIFrame clickItalic(){
		 WebElement italic=driver.findElement(By.xpath("//div[@id='mceu_4']/button"));
	     italic.click();
		 return this;
	 }
	 WebElement italicText;
	 String italicProvera;
	 public FramesIFrame writeItalicText(String italicT){
		 driver.switchTo().frame(iframe);
	     italicText=driver.findElement(By.id("tinymce"));
	     italicProvera=italicT;
	     italicText.sendKeys(italicT);
		 return this;
	 }
	 public FramesIFrame verifyItalicText(){
		 String italicText1=italicText.getText();
		 assertEquals("Text nije italic",italicProvera, italicText1);
		 System.out.println("Uneti italic text je : "+italicText1);
		 driver.switchTo().defaultContent();
		 return this;
	 }
	 public FramesIFrame clickRightSort(){
		 WebElement textRight=driver.findElement(By.xpath("//div[@id='mceu_7']/button"));
	     textRight.click();
		 return this;
	 }
	 WebElement textRight1;
	 String rightProvera;
	 public FramesIFrame writeTextRight(String rightT){
		 driver.switchTo().frame(iframe);
	     textRight1=driver.findElement(By.id("tinymce"));
	     textRight1.sendKeys(rightT);
	     rightProvera=rightT;
		 return this;
	 }
	 public FramesIFrame verifyRightcText(){
		 String textRight2=textRight1.getText();
	     assertEquals("Text nije sortiran desno",italicProvera+rightProvera, textRight2);
	     System.out.println("Uneti text centriran desno je : "+textRight2);
	     driver.switchTo().defaultContent();
		 return this;
	 }
	 public FramesIFrame clickCentarText(){
		 WebElement textCentar=driver.findElement(By.xpath("//div[@id='mceu_6']/button"));
	     textCentar.click();
		 return this;
	 }
	 WebElement textCentar1;
	 String centarProvera;
	 public FramesIFrame writeCentarRight(String centarText){
		 driver.switchTo().frame(iframe);
	     textCentar1=driver.findElement(By.id("tinymce"));
	     textCentar1.sendKeys(centarText);
	     centarProvera=centarText;
		 return this;
	 }
	 public void verifyCentarText(){
		 String textCentar2=textCentar1.getText();
	     assertEquals("Text nije sortiran centralno",italicProvera+rightProvera+centarProvera, textCentar2);
	     System.out.println("Uneti text centriran po centrali je : "+textCentar2);
	     driver.switchTo().defaultContent();
	 }

}
