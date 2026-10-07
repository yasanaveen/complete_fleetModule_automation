package testCases;

import org.testng.annotations.Test;

import pageObjects.AddBatteryObjects;
import pageObjects.AddTyreObjects;

public class Tc0003AddBatteryTestclass extends BaseClass {

	@Test
	public void addBatteryTest() {

		System.out.println(".....Tc0003AddBatteryTestclass started....");

		AddTyreObjects fl = new AddTyreObjects(driver);
		fl.clickOnFleetModule();
		log.info("Clicked on Fleet Module");

		AddBatteryObjects ab = new AddBatteryObjects(driver);
		ab.getAddBatteryButton();
		log.info("Clicked on Add Battery button");

		ab.getDropdown_manufacturerName();
		log.info("Selected Manufacturer Name");

		ab.input_batterymodel("BATTERY123");
		log.info("Entered Battery Model");
		ab.getDropdown_modelYear();
		log.info("Selected Model Year");
		ab.input_batteryNo("BATTERY123");
		log.info("Entered Battery Number");
		ab.input_batteryCapacity("100");
		log.info("Entered Battery Capacity");
		ab.getDropdown_batteryCondition();
		log.info("Selected Battery Condition");
		ab.input_warrantyInMonths("24");
		log.info("Entered Warranty Months");
		ab.getDropdown_purchasedBy();
		log.info("Selected Purchased By");
		ab.input_poNo("PO123");
		log.info("Entered PO Number");
		ab.input_purchasedCost("1000");
		log.info("Entered Purchased Cost");

	}

}
