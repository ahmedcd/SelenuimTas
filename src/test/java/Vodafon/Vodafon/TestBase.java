package Vodafon.Vodafon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

	WebDriver driver;

	// Setup Before Test
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/index.php");
	}

	// Close Browser After Test
	@AfterTest
	public void closeDriver() {
		driver.quit();
	}

}
