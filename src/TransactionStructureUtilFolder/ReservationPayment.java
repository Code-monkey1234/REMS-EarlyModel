/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransactionStructureUtilFolder;

/**
 *
 * @author User
 */
public class ReservationPayment implements PaymentStrategy {
    private double reservationFee;

    public ReservationPayment(double reservationFee) {
        this.reservationFee = reservationFee;
    }

    @Override
    public double calculateAmount() {
        // implementation
        System.out.println("Reservation Fee: " + reservationFee);
        return reservationFee;
    }

    @Override
    public void processPayment() {
        // implementation
        System.out.println("Processing reservation payment of: " + reservationFee);
    }

    @Override
    public String getPaymentDetails() {
        // implementation
        return "Reservation Payment | Fee: " + reservationFee;
    }

    public double getReservationFee() { return reservationFee; }
    public void setReservationFee(double fee) { this.reservationFee = fee; }
}
