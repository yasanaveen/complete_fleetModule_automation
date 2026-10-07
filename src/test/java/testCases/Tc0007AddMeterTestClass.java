package testCases;

import org.testng.annotations.Test;

import pageObjects.AddMeterObjects;

public class Tc0007AddMeterTestClass extends BaseClass {

    @Test
    public void addMeterTest() {

        // Create Page Object
        AddMeterObjects meter =
                new AddMeterObjects(driver);


        // ==========================================
        // REPLACING METER
        // ==========================================

        meter.selectReplacingMeter();


        // ==========================================
        // BRANCH
        // ==========================================

        meter.clickBranch();

        // TODO: Select Branch from dropdown


        // ==========================================
        // MANUFACTURER COMPANY NAME
        // ==========================================

        meter.clickManufacturerCompany();

        // TODO: Select Manufacturer Company from dropdown


        // ==========================================
        // METER NAME
        // ==========================================

        meter.enterMeterName("Digital Meter");


        // ==========================================
        // METER NUMBER
        // ==========================================

        meter.enterMeterNo("MTR10001");


        // ==========================================
        // DATE
        // ==========================================

        meter.clickDate();

        // TODO: Select Date from date picker


        // ==========================================
        // METER PURCHASED COST
        // ==========================================

        meter.enterMeterPurchaseCost("5000");


        // ==========================================
        // MODEL YEAR
        // ==========================================

        meter.clickModelYear();

        // TODO: Select Model Year from dropdown


        // ==========================================
        // INITIAL READING
        // ==========================================

        meter.enterInitialReading("100");


        // ==========================================
        // PURCHASE ORDER NUMBER
        // ==========================================

        meter.enterPurchaseOrderNo("PO-MTR-10001");


        // ==========================================
        // PURCHASED BY
        // ==========================================

        meter.clickPurchasedBy();

        // TODO: Select Purchased By from dropdown


        // ==========================================
        // MAINTAINED BY
        // ==========================================

        meter.clickMaintainedBy();

        // TODO: Select Maintained By from dropdown


        // ==========================================
        // REMARKS
        // ==========================================

        meter.enterRemarks(
                "Meter replaced and added successfully."
        );


        // ==========================================
        // UPLOAD METER PURCHASE INVOICE
        // ==========================================

        meter.uploadMeterPurchaseInvoice(
                "C:\\TestData\\meter-invoice.pdf"
        );
    }
}