package testCases;

import org.testng.annotations.Test;

import pageObjects.FuelLogObjects;

public class Tc0005AddFuelLogTestClass extends BaseClass {

    @Test
    public void addFuelLogTest() {

        // Create Page Object
        FuelLogObjects fuelLog = new FuelLogObjects(driver);


        // ==========================================
        // SELECT BRANCH
        // ==========================================

        fuelLog.clickBranch();

        // TODO: Select Branch from dropdown


        // ==========================================
        // SELECT VEHICLE
        // ==========================================

        fuelLog.clickVehicle();

        // TODO: Select Vehicle from dropdown


        // ==========================================
        // SELECT DATE
        // ==========================================

        fuelLog.clickDate();

        // TODO: Select Date from date picker


        // ==========================================
        // DRIVER
        // ==========================================

        fuelLog.enterDriver("Ravi Kumar");


        // ==========================================
        // STANDARD MILEAGE
        // ==========================================

        fuelLog.enterStandardMileage("12");


        // ==========================================
        // TRANSPORT RANGE
        // ==========================================

        fuelLog.enterTransportRange("50");


        // ==========================================
        // OPENING KMS
        // ==========================================

        fuelLog.enterOpeningKms("10000");


        // ==========================================
        // CLOSING KMS
        // ==========================================

        fuelLog.enterClosingKms("10050");


        // ==========================================
        // FUEL
        // ==========================================

        fuelLog.enterFuel("20");


        // ==========================================
        // FIXED MILEAGE
        // ==========================================

        fuelLog.enterFixedMileage("12");


        // ==========================================
        // COST PER LITRE
        // ==========================================

        fuelLog.enterCostPerLitre("100");


        // ==========================================
        // TOTAL AMOUNT
        // ==========================================

        fuelLog.enterTotalAmount("2000");


        // ==========================================
        // PAYMENT MODE
        // ==========================================

        fuelLog.clickPaymentMode();

        // TODO: Select Payment Mode


        // ==========================================
        // BILL NUMBER
        // ==========================================

        fuelLog.enterBillNumber("BILL10001");


        // ==========================================
        // INCHARGE
        // ==========================================

        fuelLog.clickIncharge();

        // TODO: Select Incharge


        // ==========================================
        // UPLOAD RECEIPT
        // ==========================================

        fuelLog.clickUploadReceipt();

        // TODO: Upload receipt file


        // ==========================================
        // REMARKS
        // ==========================================

        fuelLog.enterRemarks("Fuel log added successfully.");


        // ==========================================
        // UPLOAD BULK FUEL LOG
        // ==========================================

        // Uncomment when bulk upload needs to be tested
        // fuelLog.clickUploadBulkFuelLog();
    }
}