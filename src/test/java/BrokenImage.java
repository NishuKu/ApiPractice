import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hotstar.com/in");
		System.out.println("Hotstar page open");

		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,100);");
		System.out.println("scrolling done");

		List<WebElement> listofImages = driver.findElements(By.xpath("//img"));

		for(WebElement img:listofImages) {
			if(img.getSize().height <=24 && img.getSize().width <=24) {
				System.out.println("image is broken"+"---->"+img.getAttribute("src"));
			}
			else {
				System.out.println("image i not broken"+"---->"+img.getAttribute("src"));
			}
		}
		System.out.println(listofImages.size());
	}

}
