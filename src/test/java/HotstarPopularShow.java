import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import groovyjarjarantlr4.v4.parse.ANTLRParser.action_return;

public class HotstarPopularShow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hotstar.com/in");
		System.out.println("Hotstar page open");

		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,100);");
		System.out.println("scrolling done");

		List<WebElement> listWe = driver.findElements(By.xpath("//a[text()='Popular Shows']/ancestor::div[@class='tray-container']/descendant::article[@class='ripple show-card vertical']/a"));
		//Iterator<WebElement> it=listWe.iterator();
	int count = listWe.size();
	System.out.println(count);
		for(WebElement we:listWe) {
			break;
		}
		for(int i=0;i<listWe.size();i++) { 
			System.out.println(listWe.get(i).getAttribute("to").split("/")[3]);
		}
				driver.close();
	}



}
































