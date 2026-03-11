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
public class CashPayment implements PaymentStrategy{
    private double totalContractPrice;
    private Client client; //import 
    private Property property; //import 

    public CashPayment(double totalContractPrice, Client client, Property property) {
        this.totalContractPrice = totalContractPrice;
        this.client = client;
        this.property = property;
    }

    @Override
    public double calculateAmount() {
        // implementation
        System.out.println("Total Contract Price (Cash): " + totalContractPrice);
        return totalContractPrice;
    }

    @Override
    public void processPayment() {
        // implementation
        property.sellLot();
        System.out.println("Cash payment of " + totalContractPrice + " processed.");
        triggerDeed();
    }

    @Override
    public String getPaymentDetails() {
        // implementation
        return "Cash Payment | TCP: " + totalContractPrice;
    }

    public void triggerDeed() {
        // implementation
        System.out.println("Deed of Absolute Sale will be generated for " + client.getName());
    }

    public double getTotalContractPrice() { return totalContractPrice; }
    public void setTotalContractPrice(double tcp) { this.totalContractPrice = tcp; }
}
