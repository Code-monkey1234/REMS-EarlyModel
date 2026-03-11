/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransactionStructureMainFolder;

/**
 *
 * @author User
 */
public class Receipt {
    private int receiptID;
    private double amount;
    private Payment payment;

    public Receipt(int receiptID, double amount, Payment payment) {
        this.receiptID = receiptID;
        this.amount = amount;
        this.payment = payment;
    }

    public String getDetails() {
        // implementation
        return "Receipt ID: " + receiptID + " | Amount: " + amount + " | Date: " + payment.getPaidAt();
    }

    public int getReceiptID() { return receiptID; }
    public double getAmount() { return amount; }
    public Payment getPayment() { return payment; }
}
