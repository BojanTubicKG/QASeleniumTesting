package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class TestAbstract {
	
    static WebDriver driver;
	
	public static void start(){
		 System.setProperty("webdriver.gecko.driver",  "C:\\Java_Externe_Biblioteke\\geckodriver-v0.14.0-win64\\geckodriver.exe");			
		 driver=new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://the-internet.herokuapp.com");
	}

	public static void end(){
		driver.quit();
	}
	
	
	
}
