/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransactionStructureUtilFolder;

import UserStructureMainFolder.Client;
import PropertyStructureMainFolder.Property;

/**
 *
 * @author User
 */
public class InstallmentPayment implements PaymentStrategy{
    private double monthlyAmortization;
    private int monthsPaid;
    private int totalMonths;
    private double remainingBalance;
    private Client client; //import
    private Property property; //import

    public InstallmentPayment(double monthlyAmortization, int totalMonths,
                               double totalBalance, Client client, Property property) {
        this.monthlyAmortization = monthlyAmortization;
        this.totalMonths = totalMonths;
        this.remainingBalance = totalBalance;
        this.monthsPaid = 0;
        this.client = client;
        this.property = property;
    }

    @Override
    public double calculateAmount() {
        // implementation
        System.out.println("Monthly Amortization: " + monthlyAmortization);
        return monthlyAmortization;
    }

    @Override
    public void processPayment() {
        // implementation
        remainingBalance -= monthlyAmortization;
        monthsPaid++;
        System.out.println("Installment payment processed. Months paid: " + monthsPaid + "/" + totalMonths);
        System.out.println("Remaining balance: " + remainingBalance);

        if (isFullyPaid()) {
            triggerDeed();
        }
    }

    @Override
    public String getPaymentDetails() {
        // implementation
        return "Installment Payment | Monthly: " + monthlyAmortization +
               " | Paid: " + monthsPaid + "/" + totalMonths +
               " | Remaining: " + remainingBalance;
    }

    public boolean isFullyPaid() {
        // implementation
        return monthsPaid >= totalMonths || remainingBalance <= 0;
    }

    public void triggerDeed() {
        // implementation
        property.sellLot();
        System.out.println("Fully paid! Deed of Absolute Sale will be generated for " + client.getName());
    }

    public double getMonthlyAmortization() { return monthlyAmortization; }
    public int getMonthsPaid() { return monthsPaid; }
    public int getTotalMonths() { return totalMonths; }
    public double getRemainingBalance() { return remainingBalance; }

    public void setMonthlyAmortization(double ma) { this.monthlyAmortization = ma; }
    public void setTotalMonths(int months) { this.totalMonths = months; }
}
