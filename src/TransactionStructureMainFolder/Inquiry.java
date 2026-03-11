/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransactionStructureMainFolder;

import UserStructureMainFolder.Client;
import PropertyStructureMainFolder.Property;
/**
 *
 * @author User
 */
public class Inquiry {
    private int inquiryID;
    private Client client; //import client
    private Property property; //import property
    private String message; 
    private String response;

    public Inquiry(int inquiryID, Client client, Property property, String message) {
        this.inquiryID = inquiryID;
        this.client = client;
        this.property = property;
        this.message = message;
    }

    public void makeInquiry() {
        // implementation
        System.out.println("Inquiry made by " + client.getName() + " for Lot " + property.getLotID());
    }

    public void viewInquiry() {
        // implementation
        System.out.println("Inquiry ID: " + inquiryID + " | Message: " + message);
    }

    public void deleteInquiry() {
        // implementation
        System.out.println("Inquiry ID " + inquiryID + " deleted.");
    }

    public void viewResponse() {
        // implementation
        System.out.println("Response: " + (response != null ? response : "No response yet."));
    }

    public void setResponse(String response) { this.response = response; }

    public int getInquiryID() { return inquiryID; }
    public Client getClient() { return client; }
    public Property getProperty() { return property; }
    public String getMessage() { return message; }
    public String getResponse() { return response; }
}
