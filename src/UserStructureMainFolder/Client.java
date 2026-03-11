/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserStructureMainFolder;

import java.util.ArrayList;
import java.util.List;  

import TransactionStructureMainFolder.Payment;
import TransactionStructureMainFolder.Inquiry;
import TransactionStructureMainFolder.Reservation;
import TransactionStructureEnumFolder.PaymentOptions;
import TransactionStructureMainFolder.Document;
import PropertyStructureMainFolder.Property;
import PropertyStructureMainFolder.Block;
/**
 *
 * @author User
 */
public class Client extends User{
    private double budget;
    private double amount;
    private PaymentOptions paymentMode; 
    private Agent agent; 
    private Payment payment; 
    private Reservation reservation; 
    private List<Inquiry> myInquiries = new ArrayList<>(); 
    private List<Reservation> myReservations = new ArrayList<>();  
    private List<Payment> myPayments = new ArrayList<>();
    
    //creates the client user constructor by refferencing the User parent
    public Client(int userID, String name, String email, int phoneNumber, String password){
        super(userID, name, email, phoneNumber, password);
    }
    
    
//Needs implementation   
//    public Property searchLot(double lotSize){
//        //implementation
//    }
//    
//
//    public Block searchLocation(int blockNum){
//        //implementation
//        
//    }
//    
//
//    public List<Property> budgetFilter(){
//        //implementation
//    }

    
    public void viewProperty(){
        //implementation
    }
    
    
    //create implementation
    public void sendRequest(){
        //implemen
    }
    
    public void makePayment() {
        // implementation
        if (payment != null) {
            payment.executePayment();
        }
    }

    public String showClientDetails() {
        // implementation
        return "Client: " + getName() + " | Email: " + getEmail();
    }

    public void cancelReservation() {
        // implementatio
    }

    public void trackPaymentProgress() {
        // implementation
    }

    public void downloadDocument(Document document) {
        // implementation
        System.out.println("Downloading document: " + document.getType());
    }

    // Getters and Setters
    public double getBudget() { return budget; }
    public double getAmount() { return amount; }
    public PaymentOptions getPaymentMode() { return paymentMode; } //make pament option class to remove error
    public Agent getAgent() { return agent; }
    public Payment getPayment() { return payment; } // make payment class to remove error
    public Reservation getReservation() { return reservation; }//make reservation class to remove error
    public List<Inquiry> getMyInquiries() { return myInquiries; } //make inquiry class to remove error
    public List<Reservation> getMyReservations() { return myReservations; } //make reservation class to remove error
    public List<Payment> getMyPayments() { return myPayments; } //same here just the class

    public void setBudget(double budget) { this.budget = budget; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setPaymentMode(PaymentOptions paymentMode) { this.paymentMode = paymentMode; } //here the class
    public void setAgent(Agent agent) { this.agent = agent; }
    public void setPayment(Payment payment) { this.payment = payment; }//class againto remove error
    public void setReservation(Reservation reservation) { this.reservation = reservation; }//class again to remove error
}
