package test;



import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicAuth {
	
WebDriver driver;
	
	public BasicAuth(WebDriver driver) {
		this.driver=driver;
	}
	
	public BasicAuth sentUserPass(String username,String pass) throws IOException{
		
		//WebDriver driver =this.driver;
		
		//FirefoxProfile firefoxProfile=new FirefoxProfile();
		//FirefoxDriver fd=new FirefoxDriver(firefoxProfile);

	    //String URL = "http://" + username + ":" + pass + "@" + "the-internet.herokuapp.com";
	    //driver.get(URL);
	    //driver.manage().window().maximize();
		//WebDriverWait wait = new WebDriverWait(driver, 10);      
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent());     
		//alert.authenticateUsing(new UserAndPassword(username, pass));
		
		 String webPage = "http://the-internet.herokuapp.com";
	     String Uname = username;
	     String password = pass;

	        String authString = Uname + ":" + password;
	        System.out.println("auth string: " + authString);
	        byte[] authEncBytes = Base64.encodeBase64(authString.getBytes());
	        String authStringEnc = new String(authEncBytes);
	        System.out.println("Base64 encoded auth string: " + authStringEnc);

	        URL url = new URL(webPage);
	        URLConnection urlConnection = url.openConnection();
	        urlConnection.setRequestProperty("Authorization", "Required" + authStringEnc);
	        InputStream is = urlConnection.getInputStream();
	        InputStreamReader isr = new InputStreamReader(is);
		
		return this;
	}

}
