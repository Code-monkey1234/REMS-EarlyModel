/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransactionStructureMainFolder;

import UserStructureMainFolder.Client;
import TransactionStructureEnumFolder.ReservationStatus;

/**
 *
 * @author User
 */
public class Reservation {
    private int reservationID;
    private Client client; //ijmport cleint
    private int block;
    private int lot;
    private ReservationStatus reservationStatus; //make enum

    public Reservation(int reservationID, Client client, int block, int lot) {
        this.reservationID = reservationID;
        this.client = client;
        this.block = block;
        this.lot = lot;
        this.reservationStatus = ReservationStatus.PENDING;
    }

    public void approve() {
        // implementation
        this.reservationStatus = ReservationStatus.APPROVED;
        notifyParties();
        System.out.println("Reservation " + reservationID + " approved.");
    }

    public void reject(String reason) {
        // implementation
        this.reservationStatus = ReservationStatus.REJECTED;
        notifyParties();
        System.out.println("Reservation " + reservationID + " rejected. Reason: " + reason);
    }

    public void cancel() {
        // implementation
        this.reservationStatus = ReservationStatus.CANCELLED;
        System.out.println("Reservation " + reservationID + " cancelled.");
    }

    public void notifyParties() {
        // implementation
        System.out.println("Notifying parties about reservation " + reservationID + " status: " + reservationStatus);
    }

    public int getReservationID() { return reservationID; }
    public Client getClient() { return client; }
    public int getBlock() { return block; }
    public int getLot() { return lot; }
    public ReservationStatus getReservationStatus() { return reservationStatus; }

    public void setReservationStatus(ReservationStatus status) { this.reservationStatus = status; }
}
