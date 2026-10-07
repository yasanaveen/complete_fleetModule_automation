package testCases;

import org.testng.annotations.Test;

import pageObjects.LubricantLogObjects;

public class Tc00011AddVehicleLubricantLogTestClass  extends BaseClass {

    @Test
    public void addLubricantLogTest() {

        LubricantLogObjects lubricantLog = new LubricantLogObjects(driver);

        // ==========================================
        // Branch
        // ==========================================

        lubricantLog.clickBranch();
        // TODO: Select Branch


        // ==========================================
        // Lubricant Type
        // ==========================================

        lubricantLog.clickLubricantType();
        // TODO: Select Lubricant Type


        // ==========================================
        // UOM
        // ==========================================

        lubricantLog.clickUOM();
        // TODO: Select UOM


        // ==========================================
        // Purchase Date
        // ==========================================

        lubricantLog.clickPurchaseDate();
        // TODO: Select Purchase Date


        // ==========================================
        // Total Litres
        // ==========================================

        lubricantLog.enterTotalLitres("20");


        // ==========================================
        // Amount Per KG/Ltr
        // ==========================================

        lubricantLog.enterAmountPerKgLtr("100");


        // ==========================================
        // Total Amount
        // ==========================================

        lubricantLog.getTotalAmount();


        // ==========================================
        // Receipt Number
        // ==========================================

        lubricantLog.enterReceiptNo("REC-10001");


        // ==========================================
        // Upload Receipt
        // ==========================================

        lubricantLog.uploadReceipt(
                "C:\\TestData\\lubricant-receipt.pdf"
        );


        // ==========================================
        // Click Upload Button
        // ==========================================

        lubricantLog.clickUploadReceipt();


        // ==========================================
        // Remarks
        // ==========================================

        lubricantLog.enterRemarks(
                "Lubricant log added successfully."
        );
    }
}