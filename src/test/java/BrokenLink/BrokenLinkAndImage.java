package BrokenLink;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinkAndImage {

	@Test
	public void brokenlink() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nishu\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		List<WebElement> list = driver.findElements(By.xpath("//a"));
		ArrayList<String> ar=new ArrayList<String>();
		
		for(WebElement e:list) {
			String link = e.getAttribute("href");
			ar.add(link);
//			ar.remove(null);
//			ar.size();
		}
		for(String s: ar) {
		//	System.out.println(s);
			URL url=new URL(s);
			HttpsURLConnection res = (HttpsURLConnection)url.openConnection();
			res.connect();
			
			if(res.getResponseCode()<300) {
				System.out.println(s);
			}
			else
			{
				System.out.println("broken");
			}
			
		}
		
	}
}
