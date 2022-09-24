package BrokenLink;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExcecution {

	public void main(String[]arg) throws MalformedURLException {
		URL url = new URL("http://localhost:5555/wd/hub");
		DesiredCapabilities desire = new DesiredCapabilities();
		desire.setBrowserName("chrome");
		//desire.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver=new RemoteWebDriver(url,desire);
		driver.get("http://gmail.com");
	}
}

