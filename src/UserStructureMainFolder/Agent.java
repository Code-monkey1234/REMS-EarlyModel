
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserStructureMainFolder;
import TransactionStructureMainFolder.Inquiry;
import TransactionStructureMainFolder.Reservation;
import TransactionStructureMainFolder.Payment;

import java.util.ArrayList;
import java.util.List;  

/**
 *
 * @author User
 */
public class Agent extends User{
    private Client buyer;
    private RealEstate realEstate;
    private List<Inquiry> inquiryTable = new ArrayList<>();
    private List<Reservation> reservationTable = new ArrayList<>();
    private List<Payment> paymentsTable = new ArrayList<>();

    public Agent(int userID, String name, String email, int phoneNumber, String password) {
        super(userID, name, email, phoneNumber, password);
    }

    //make class  and implementation to remove error
    public List<Inquiry> viewInquiry() {
        // implementation
        //return placeholder
        return inquiryTable;
    }

    //make class  and implementation to remove error
    public void sendDetails() {
        // implementation
    }

    //make class  and implementation to remove error
    public List<Reservation> viewRequests() {
        // implementation
        //return placeholder
        return reservationTable;
    }

    //make implementation to remove error [this is forwarded to admin]
    public void sendRequest() {
        // implementation
        
    }

    //make implementation to remove error
    public void viewClientProgress() {
        // implementation
    }

    
    public String showAgentDetails() {
        // implementation
        return "Agent: " + getName() + " | Email: " + getEmail();
    }

    //make implementation to remove error [sent to client]
    public void sendDoc() {
        // implementation
      
    }

    //make the class too to remove eror
    //notify admin of reservation process and add reservation of client to table?
    public void processReservation(Reservation reservation) {
        // implementation
    }

    //make the class too to remov eror
    //notify admin and add payment of client to payment table
    public void confirmPayment(Payment payment) {
        // implementation
        
    }

    // Getters and Setters
    public Client getBuyer() { return buyer; }
    public RealEstate getRealEstate() { return realEstate; }
    public List<Inquiry> getInquiryTable() { return inquiryTable; } //class make so remove error
    public List<Reservation> getReservationTable() { return reservationTable; }//class make so remove error
    public List<Payment> getPaymentsTable() { return paymentsTable; }//class make so remove error

    public void setBuyer(Client buyer) { this.buyer = buyer; }
    public void setRealEstate(RealEstate realEstate) { this.realEstate = realEstate; }
}
