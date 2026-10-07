package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.AddTyreObjects;

public class Tc0002FleetAddTyre extends BaseClass {

	@Test
	public void FleetLandingPageTest() throws IOException, InterruptedException {

		System.out.println("************ started TC_0002FleetLandingPageTestclass ***********");

		AddTyreObjects fl = new AddTyreObjects(driver);
		fl.clickOnFleetModule();
		log.info("Clicked on Fleet Module");

		fl.clickOnAddTyre();
		log.info("Clicked on Add Tyre");

		fl.selectManufacturerName("MRF TYRES");
		log.info("Selected Manufacturer Name");
		fl.enterTyreModel("MRF123");
		log.info("Entered Tyre Model");
		fl.selectModelYear();
		log.info("Selected Model Year");
		fl.enterTyreNo("TYRE123");
		log.info("Entered Tyre Number");

		fl.selectTyreSize();
		log.info("Selected Tyre Size");

		fl.selectTyreType();
		log.info("Selected Tyre Type");

		fl.enterWarrantyMonths("24");
		log.info("Entered Warranty Months");
		fl.enterWarrantyKms("500");
		log.info("Entered Warranty Kms");
		fl.selectPurchasedBy();
		log.info("Selected Purchased By");
		fl.enterPoNo("PO123");
		log.info("Entered PO Number");
		fl.enterPurchasedCost("1000");
		log.info("Entered Purchased Cost");
		
		log.info("Scrolled down the page");
		fl.selectVendorName();
		log.info("Selected Vendor Name");
		
		//*[@name='specifications']

		System.out.println("************ completed TC_0002FleetLandingPageTestclass***********");
	}

}
