/**
 * @author Srilatha
 */
package SeleniumTopics;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author srilata
 *
 */
public class HandlingPops {

	// how to handle the permission pop-ups using selenium webdriver?

	@Test(groups = {"srigroup"})
	public void handlingPopups() throws Exception {
		
		
		ChromeOptions options=new ChromeOptions();
		HashMap<String, Integer> contentsettings = new HashMap<>();
		HashMap<String , Object> profile =  new HashMap<>();
		HashMap<String, Object>prefs = new HashMap<>();
		
		contentsettings.put("notifications", 2);
		/*
		 * contentsettings.put("geolocation", 2); contentsettings.put("media_stream",
		 * 1);
		 */
		profile.put("managed_default_content_settings", contentsettings);
		prefs.put("profile",profile);
		
		options.setExperimentalOption("prefs", prefs);
		WebDriverManager.chromedriver().setup();
		//options.addArguments("disable-notification");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://whatmylocation.com/");
		driver.quit();
	}
}
