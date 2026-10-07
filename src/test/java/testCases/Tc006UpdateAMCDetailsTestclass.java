package testCases;

import org.testng.annotations.Test;

import pageObjects.AddTyreObjects;
import pageObjects.RTOUpdateConditionsObjects;
import pageObjects.UpdateAMCObjects;

public class Tc006UpdateAMCDetailsTestclass extends BaseClass {

	@Test
	public void testUpdateAMCDetails() {
		AddTyreObjects fl = new AddTyreObjects(driver);
		fl.clickOnFleetModule();
		log.info("Clicked on Fleet Module");

		RTOUpdateConditionsObjects updateConditionsObjects = new RTOUpdateConditionsObjects(driver);
		updateConditionsObjects.clkUpdateCard();
		updateConditionsObjects.getSelectVehicleFromRecentSearch();

		UpdateAMCObjects updateAMCObjects = new UpdateAMCObjects(driver);
		scrollDown(700);
		updateAMCObjects.clkUpdateAMCButton();
		scrollDown(700);
		updateAMCObjects.ClkProceedButton();

	}

}
