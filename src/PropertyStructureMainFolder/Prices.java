/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PropertyStructureMainFolder;

/**
 *
 * @author User
 */
public class Prices {
    private double totalContractPrice;
    private Property property;
    private double reservationFee;
    private double discount;
    private double downPaymentPercent;
    private int installmentMonths;
    private double interestRate;
    private double netDP;
    private double monthlyAmort;

    public Prices(double totalContractPrice, double reservationFee, double discount,
                  double downPaymentPercent, int installmentMonths, double interestRate) {
        this.totalContractPrice = totalContractPrice;
        this.reservationFee = reservationFee;
        this.discount = discount;
        this.downPaymentPercent = downPaymentPercent;
        this.installmentMonths = installmentMonths;
        this.interestRate = interestRate;
    }

    //this is just some sample formula
    public double calculateTotalCashPrice() {
        // implementation
        double tcp = totalContractPrice - discount;
        System.out.println("Total Cash Price: " + tcp);
        return tcp;
    }
    
    //this is just some sample formula
    public double calculateReservationFee() {
        // implementation
        System.out.println("Reservation Fee: " + reservationFee);
        return reservationFee;
    }

    //this is just some sample formula
    public double calculateDownPayment() {
        // implementation
        netDP = (totalContractPrice * downPaymentPercent / 100) - reservationFee;
        System.out.println("Net Down Payment: " + netDP);
        return netDP;
    }

    //this is just some sample formula
    public double calculateMonthlyAmortization() {
        // implementation
        double balance = totalContractPrice - (totalContractPrice * downPaymentPercent / 100);
        monthlyAmort = (balance * (1 + interestRate)) / installmentMonths;
        System.out.println("Monthly Amortization: " + monthlyAmort);
        return monthlyAmort;
    }

    // Getters and Setters
    public double getTotalContractPrice() { return totalContractPrice; }
    public double getReservationFee() { return reservationFee; }
    public double getDiscount() { return discount; }
    public double getDownPaymentPercent() { return downPaymentPercent; }
    public int getInstallmentMonths() { return installmentMonths; }
    public double getInterestRate() { return interestRate; }
    public double getNetDP() { return netDP; }
    public double getMonthlyAmort() { return monthlyAmort; }

    public void setTotalContractPrice(double tcp) { this.totalContractPrice = tcp; }
    public void setReservationFee(double fee) { this.reservationFee = fee; }
    public void setDiscount(double discount) { this.discount = discount; }
}
