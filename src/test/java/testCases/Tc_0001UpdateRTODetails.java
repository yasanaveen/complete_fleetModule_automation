package testCases;

import org.testng.annotations.Test;

import pageObjects.AddTyreObjects;
import pageObjects.RTOUpdateConditionsObjects;

public class Tc_0001UpdateRTODetails extends BaseClass {

	@Test
	public void updateRTODetails() throws InterruptedException {

		AddTyreObjects fl = new AddTyreObjects(driver);
		fl.clickOnFleetModule();
		log.info("Clicked on Fleet Module");

		RTOUpdateConditionsObjects updateConditionsObjects = new RTOUpdateConditionsObjects(driver);
		updateConditionsObjects.clkUpdateCard();
		updateConditionsObjects.getSelectVehicleFromRecentSearch();

		scrollDown(500);
		updateConditionsObjects.getClkRtoDetailsButton();
		updateConditionsObjects.getClkProceedButton();
		updateConditionsObjects.clickRtoType();
		updateConditionsObjects.clickRtoOfficeName();
		updateConditionsObjects.clickIssuedFromDate();
		updateConditionsObjects.clickExpiryDate();
		updateConditionsObjects.enterAmount("1000");
		updateConditionsObjects.uploadReceipt("C:\\Users\\mohan\\Downloads\\sample.pdf");
		updateConditionsObjects.uploadDocument("C:\\Users\\mohan\\Downloads\\sample.pdf");
		updateConditionsObjects.enterRemarks("Test Remarks");
		
		
		
		

	}

}
