package testCases;

import org.testng.annotations.Test;

import pageObjects.DriverAllowanceObjects;

public class Tc0012DriverAllowanceTestClass extends BaseClass {

	@Test
	public void driverAllowanceTest() {

		DriverAllowanceObjects driverAllowance = new DriverAllowanceObjects(driver);

		// ==========================================
		// Branch
		// ==========================================

		driverAllowance.clickBranch();

		driverAllowance.clickDriver();
		// TODO: Select Driver

		// ==========================================
		// Mobile Number - Read Only
		// ==========================================

		String mobileNumber = driverAllowance.getMobileNumber();

		System.out.println("Mobile Number: " + mobileNumber);

		// ==========================================
		// From Date
		// ==========================================

		driverAllowance.clickFromDate();
		// TODO: Select From Date

		// ==========================================
		// To Date
		// ==========================================

		driverAllowance.clickToDate();
		// TODO: Select To Date

		// ==========================================
		// No. of Hours
		// ==========================================

		driverAllowance.enterNoOfHours("8");
		driverAllowance.enterAllowanceAmount("1000");
		driverAllowance.enterRemarks("Driver allowance added successfully.");
	}
}