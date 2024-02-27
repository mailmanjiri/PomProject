package util;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class BrowserFactory {
	

static WebDriver driver;

	@Test
	static public WebDriver init() {   //init- initialize, 
		// set system property
				System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
				driver= new ChromeDriver();
				// delete cookies has to happen before going to application
				driver.manage().deleteAllCookies();
				// Launch the application
				driver.get("https://codefios.com/ebilling/login");
				// maximize the window
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				return driver;
				
	}

	
	static public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	
}
