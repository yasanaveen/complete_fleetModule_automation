package testCases;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjects.LoginPageObjects;

public class BaseClass {

	public WebDriver driver;
	public static Logger log;

	@BeforeClass
	public void setUp() {

		log = LogManager.getLogger(this.getClass());

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://192.168.20.19:8443/login");
		log.info("Browser launched and navigated to login page");

		LoginPageObjects lp = new LoginPageObjects(driver);
		lp.setuserNameAndPassword("mohan530", "123123");
		log.info("Entered username and password");
		log.info("Clicking on login button");

	}

	public void scrollDown(int pixels) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0, " + pixels + ");");
	}

	@AfterClass
	public void tearDown() {
//		driver.quit();
//		log.info("Browser closed");
	}

}
