package base_classes;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.io.FileHandler;

public class Base_class_001 {

	public static WebDriver driver;

	// dynamic code for browser launch

	public static void LaunchBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable - notifications");
			driver = new ChromeDriver(option);
		} else if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions option1 = new FirefoxOptions();
			option1.addArguments("--disable - notifications");
			driver = new FirefoxDriver(option1);
		} else if (browser.equalsIgnoreCase("edge")) {
			EdgeOptions option2 = new EdgeOptions();
			option2.addArguments("--disable - notifications");
			driver = new EdgeDriver(option2);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Launch broswer - " + browser);
		
		
	}

	public static void Navigate_url (String url) {
		driver.get(url);
		System.out.println("Navigate url is -" + url);
		System.out.println("Title of the webpage is " + driver.getTitle());
		
	}
	
	public static void TakeAScreenShot (String Screenshotname) throws Throwable {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File ("../selenium_maven_001/Screenshot" + Screenshotname +".png");
		FileHandler.copy(src, target);
		
	}
}
