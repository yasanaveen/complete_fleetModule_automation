package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateOwnerChangeObjects {

	WebDriver driver;

	public UpdateOwnerChangeObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[contains(@class,'__gVAFS ')])[4]")
	WebElement updateOwnerChangeButton;

	@FindBy(xpath = "//*[contains(@class,'__4R2eU ')]")
	WebElement clk_proceedButton;

	public void getUpdateOwnerChangeButton() {
		updateOwnerChangeButton.click();
	}

	public void getClkProceedButton() {
		clk_proceedButton.click();
	}

}
