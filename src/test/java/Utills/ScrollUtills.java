package Utills;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUtills {

	private WebDriver driver;
	private JavascriptExecutor js;

	public ScrollUtills(WebDriver driver) {
		this.driver = driver;
		this.js = (JavascriptExecutor) driver;
	}

	// Scroll down by given pixels
	public void scrollDown(int pixels) {

		js.executeScript("window.scrollBy(0, arguments[0]);", pixels);
	}

	// Scroll up by given pixels
	public void scrollUp(int pixels) {

		js.executeScript("window.scrollBy(0, -arguments[0]);", pixels);
	}

	// Scroll to bottom of page
	public void scrollToBottom() {

		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

	// Scroll to top of page
	public void scrollToTop() {

		js.executeScript("window.scrollTo(0, 0);");
	}

	// Scroll until the element is visible
	public void scrollToElement(WebElement element) {

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", element);
	}
}