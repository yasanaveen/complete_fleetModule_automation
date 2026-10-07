package testCases;

import org.testng.annotations.Test;

import pageObjects.LubricantLogObjects;

public class Tc0008AddLubricantLogTestClass extends BaseClass {

    @Test
    public void addLubricantLogTest() {

        LubricantLogObjects lubricantLog = new LubricantLogObjects(driver);

        // Select Branch
        lubricantLog.clickBranch();
        // TODO: Select Branch

        // Select Lubricant Type
        lubricantLog.clickLubricantType();
        // TODO: Select Lubricant Type

        // Select UOM
        lubricantLog.clickUOM();
        // TODO: Select UOM

        // Select Purchase Date
        lubricantLog.clickPurchaseDate();
        // TODO: Select Purchase Date

        // Enter Total Litres
        lubricantLog.enterTotalLitres("20");

        // Enter Amount Per KG/Ltr
        lubricantLog.enterAmountPerKgLtr("100");

        // Get Total Amount
        lubricantLog.getTotalAmount();

        // Enter Receipt Number
        lubricantLog.enterReceiptNo("REC-10001");

        // Upload Receipt
        lubricantLog.uploadReceipt("C:\\TestData\\lubricant-receipt.pdf");

        // Click Upload Button
        lubricantLog.clickUploadReceipt();

        // Enter Remarks
        lubricantLog.enterRemarks("Lubricant log added successfully.");
    }
}