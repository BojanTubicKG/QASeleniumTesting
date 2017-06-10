package test;

import java.io.IOException;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BrokenImages {
	
WebDriver driver;
	
	public BrokenImages(WebDriver driver) {
		this.driver=driver;
	}
	
	 int invalidImageCount;
	 public void verifayBrokenImg() throws ClientProtocolException, IOException{
		    invalidImageCount = 0;
			List<WebElement> imagesList = driver.findElements(By.xpath("//div[@class='example']//img"));
			System.out.println("Broj svih slika je: " + imagesList.size());
			for (WebElement imgElement : imagesList) {
				if (imgElement != null) {
					verifyimageActive(imgElement);
				}
			}
			System.out.println("Broj neucitanih slika je : "	+ invalidImageCount);

}
	 public void verifyimageActive(WebElement imgElement) {
			try {
				HttpClient client = HttpClientBuilder.create().build();
				HttpGet request = new HttpGet(imgElement.getAttribute("src"));
				HttpResponse response = client.execute(request);

				if (response.getStatusLine().getStatusCode() != 200)
					invalidImageCount++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

}
