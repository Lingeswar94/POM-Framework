package CommonFunction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Commonfunction {

	public static WebDriver driver;
	public static Properties properties;

	Logger logger = Logger.getLogger(Commonfunction.class);

	public Properties loadPropertyFile() throws IOException {
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileInputStream);
		return properties;
	}

	@BeforeSuite
	public void lanchBrowser() throws IOException {

		PropertyConfigurator.configure("log4j.properties");
		logger.info("Orange HRM begin");
		logger.info("Loading the Preporty file");
		loadPropertyFile();
		String Browser = properties.getProperty("browser");
		String Url = properties.getProperty("url");
		String driverLocation = properties.getProperty("DriverLocation");

		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation);
			logger.info("Lanuching Chrome");
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverLocation);
			logger.info("Lanuching Firefox");
			driver = new FirefoxDriver();
		}

		driver.navigate().to(Url);
		logger.info("Navigating to Appication");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterSuite
	public void tearDown() {
		logger.info("Closing the browser");
		driver.quit();
	}

}
