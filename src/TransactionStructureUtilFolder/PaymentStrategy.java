/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TransactionStructureUtilFolder;

/**
 *
 * @author User
 */
public interface PaymentStrategy {
    double calculateAmount();
    void processPayment();
    String getPaymentDetails();
}
