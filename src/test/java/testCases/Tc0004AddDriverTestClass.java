package testCases;

import org.testng.annotations.Test;

import pageObjects.AddDriverHelperObjects;

public class Tc0004AddDriverTestClass extends BaseClass {

    @Test
    public void addDriverTest() {

        // Create Page Object
        AddDriverHelperObjects driverHelper =
                new AddDriverHelperObjects(driver);

        // Select Driver
        driverHelper.selectDriver();

        // Select Temporary
        driverHelper.selectTemporary();

        // Select Branch
        driverHelper.clickBranch();

        // TODO: Select branch option from dropdown

        // Enter Name
        driverHelper.enterName("Ravi Kumar");

        // Select Date of Birth
        driverHelper.clickDateOfBirth();

        // TODO: Select DOB from date picker

        // Select Blood Group
        driverHelper.clickBloodGroup();

        // TODO: Select Blood Group option

        // Select Joining Date
        driverHelper.clickJoiningDate();

        // TODO: Select Joining Date from date picker

        // Enter Aadhar Number
        driverHelper.enterAadharNumber("123456789012");

        // Enter PAN Number
        driverHelper.enterPanNumber("ABCDE1234F");

        // Select License Type
        driverHelper.clickLicenseType();

        // TODO: Select License Type option

        // Enter License Number
        driverHelper.enterLicenseNumber("DL1234567890");

        // Select License Expiry
        driverHelper.clickLicenseExpiry();

        // TODO: Select License Expiry from date picker

        // Enter Experience
        driverHelper.enterExperience("5");

        // Enter Badge Number
        driverHelper.enterBadgeNumber("BADGE12345");

        // Select Badge Expiry
        driverHelper.clickBadgeExpiry();

        // TODO: Select Badge Expiry from date picker
    }
}