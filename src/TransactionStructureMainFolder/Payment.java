/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransactionStructureMainFolder;

import UserStructureMainFolder.Client;
import PropertyStructureMainFolder.Property;
import TransactionStructureUtilFolder.PaymentStrategy;
import TransactionStructureEnumFolder.PaymentOptions;

/**
 *
 * @author User
 */
public class Payment {
    private int paymentID;
    private double amountPaid;
    private PaymentOptions paymentType;
    private Client client; 
    private Property property; 
    private PaymentStrategy strategy; 
    private String paidAt;

    public Payment(int paymentID, Client client, Property property, PaymentStrategy strategy) {
        this.paymentID = paymentID;
        this.client = client;
        this.property = property;
        this.strategy = strategy;
        this.paidAt = java.time.LocalDate.now().toString();
    }

    public void executePayment() {
        // implementation
        this.amountPaid = strategy.calculateAmount();
        strategy.processPayment();
        generateReceipt();
        notifyParties();
    }

    public void notifyParties() {
        // implementation
        System.out.println("Notifying parties about payment ID: " + paymentID);
    }

    //importclass
    public Receipt generateReceipt() {
        // implementation
        Receipt receipt = new Receipt(
            (int)(Math.random() * 1000),
            amountPaid,
            this
        );
        System.out.println("Receipt generated for payment ID: " + paymentID);
        return receipt;
    }

    public int getPaymentID() { return paymentID; }
    public double getAmountPaid() { return amountPaid; }
    public PaymentOptions getPaymentType() { return paymentType; }
    public Client getClient() { return client; }
    public Property getProperty() { return property; }
    public PaymentStrategy getStrategy() { return strategy; }
    public String getPaidAt() { return paidAt; }

    public void setAmountPaid(double amountPaid) { this.amountPaid = amountPaid; }
    public void setPaymentType(PaymentOptions type) { this.paymentType = type; }
    public void setStrategy(PaymentStrategy strategy) { this.strategy = strategy; }
}
