package testCases;

import org.testng.annotations.Test;

import pageObjects.AddTyreObjects;
import pageObjects.RTOUpdateConditionsObjects;
import pageObjects.UpdateRcObjects;

public class Tc005UpdateRcTestClass extends BaseClass {
	@Test
	public void testUpdateRc() {
		AddTyreObjects fl = new AddTyreObjects(driver);
		fl.clickOnFleetModule();
		log.info("Clicked on Fleet Module");

		RTOUpdateConditionsObjects updateConditionsObjects = new RTOUpdateConditionsObjects(driver);
		updateConditionsObjects.clkUpdateCard();
		updateConditionsObjects.getSelectVehicleFromRecentSearch();

		UpdateRcObjects updateRcObjects = new UpdateRcObjects(driver);
		scrollDown(700);
		updateRcObjects.clkUpdateRcButton();
		scrollDown(700);
		updateRcObjects.getClkProceedButton();

	}
}
