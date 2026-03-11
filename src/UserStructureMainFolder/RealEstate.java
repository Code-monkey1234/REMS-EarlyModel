/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserStructureMainFolder;

import PropertyStructureMainFolder.Subdivision;
import PropertyStructureMainFolder.Property;

import TransactionStructureMainFolder.Reservation;
import TransactionStructureMainFolder.Payment;

/**
 *
 * @author User
 */
public class RealEstate extends User{
    private Subdivision subdivision; 
    private String subdivName;//dko lam dito kung hardcode nalang natin ung subdiv name or nah

    public RealEstate(int userID, String name, String email, int phoneNumber, String password) {
        super(userID, name, email, phoneNumber, password);

    }

    //make class and implemen
    public void approveReservation(Reservation reservation) {
        // implementation
//        reservation.approve();
//        System.out.println("Reservation ID " + reservation.getReservationID() + " approved.");
    }

    //make class and implementa
    public void rejectReservation(Reservation reservation, String reason) {
        // implementation
//        reservation.reject(reason);
//        System.out.println("Reservation ID " + reservation.getReservationID() + " rejected. Reason: " + reason);
    }

    //idk here
    public void approveSale() {
        // implementation
        System.out.println("Sale approved by admin.");
    }

    
    //make class and implementa
    public void confirmPayment(Payment payment) {
        // implementation
//        payment.getProperty().setStatus(LotStatus.RESERVED);
//        System.out.println("Payment confirmed. Lot status updated to RESERVED.");
//        payment.notifyParties();
    }

//Placeholder implementation, needs changing
//    public Document generateDeed(Client client, Property property) {
//         implementation
//        Document deed = new Document(
//            (int)(Math.random() * 1000),
//            realestate.enums.DocumentType.DEED_OF_ABSOLUTE_SALE,
//            java.time.LocalDate.now().toString(),
//            client,
//            property,
//            "/docs/deed_" + client.getUserID() + "_" + property.getLotID() + ".pdf"
//        );
//        deed.generate();
//        System.out.println("Deed of Absolute Sale generated for " + client.getName());
//        return deed;
//    }

    //send doc to client or agent
    public void sendDoc() {
        // implementation
        System.out.println("Sending document to agent/client...");
    }

    
    public String showRealEstateDetails() {
        // implementation
        return "RealEstate: " + subdivName + " | Admin: " + getName();
    }

    // Getters and Setters
    public Subdivision getSubdivision() { return subdivision; } //make the class to remove error
    public String getSubdivName() { return subdivName; }

    public void setSubdivision(Subdivision subdivision) { this.subdivision = subdivision; }//make the class to remove error
    public void setSubdivName(String subdivName) { this.subdivName = subdivName; }
}
