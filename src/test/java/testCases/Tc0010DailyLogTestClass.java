package testCases;

import org.testng.annotations.Test;

import pageObjects.*;

public class Tc0010DailyLogTestClass extends BaseClass {

    @Test
    public void dailyLogTest() {

        pageObjects.DailyLogObjects dailyLog = new pageObjects.DailyLogObjects(driver);

        // ==========================================
        // Branch
        // ==========================================

        dailyLog.clickBranch();
        // TODO: Select Branch


        // ==========================================
        // Vehicle No
        // ==========================================

        dailyLog.clickVehicleNo();
        // TODO: Select Vehicle No


        // ==========================================
        // Fixed KMS - Read Only
        // ==========================================

        String fixedKms = dailyLog.getFixedKms();
        System.out.println("Fixed KMS: " + fixedKms);


        // ==========================================
        // Expected Mileage - Read Only
        // ==========================================

        String expectedMileage = dailyLog.getExpectedMileage();
        System.out.println("Expected Mileage: " + expectedMileage);


        // ==========================================
        // Meter - Read Only
        // ==========================================

        String meter = dailyLog.getMeter();
        System.out.println("Meter: " + meter);


        // ==========================================
        // Date
        // ==========================================

        dailyLog.clickDate();
        // TODO: Select Date


        // ==========================================
        // Opening KMS - Read Only
        // ==========================================

        String openingKms = dailyLog.getOpeningKms();
        System.out.println("Opening KMS: " + openingKms);


        // ==========================================
        // Closing KMS
        // ==========================================

        dailyLog.enterClosingKms("10500");


        // ==========================================
        // Total KMS - Read Only
        // ==========================================

        String totalKms = dailyLog.getTotalKms();
        System.out.println("Total KMS: " + totalKms);


        // ==========================================
        // Remarks
        // ==========================================

        dailyLog.enterRemarks(
                "Daily log added successfully."
        );
    }
}