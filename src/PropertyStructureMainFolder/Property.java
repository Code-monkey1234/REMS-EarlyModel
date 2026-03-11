/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PropertyStructureMainFolder;

import PropertyStructureEnumFolder.LotStatus;
import PropertyStructureEnumFolder.LotType;
/**
 *
 * @author User
 */
public class Property {
    private int lotID;
    private int blockID;
    private double lotArea;
    private double size;
    private LotType lotType; //make class
    private double price;
    private LotStatus status;//make class
    private Prices prices;//make class

    public Property(int lotID, int blockID, double lotArea, double size, LotType lotType, double price) {
        this.lotID = lotID;
        this.blockID = blockID;
        this.lotArea = lotArea;
        this.size = size;
        this.lotType = lotType;
        this.price = price;
        this.status = LotStatus.AVAILABLE; //import enum
    }

    public boolean checkAvailability() {
        // implementation
        return status == LotStatus.AVAILABLE;//import enum
    }

    public void reserveLot() {
        // implementation
        this.status = LotStatus.RESERVED; //import enum
        System.out.println("Lot " + lotID + " is now RESERVED.");
    }

    public void sellLot() {
        // implementation
        this.status = LotStatus.SOLD; //import enum
        System.out.println("Lot " + lotID + " is now SOLD.");
    }

    public String showPropertyDetails() {
        // implementation
        return "Lot ID: " + lotID + " | Area: " + lotArea + " | Price: " + price + " | Status: " + status;
    }

    public void updatePropertyDetails(double price, LotStatus status) {
        // implementation
        this.price = price;
        this.status = status;
        System.out.println("Property details updated.");
    }

    // Getters and Setters
    public int getLotID() { return lotID; }
    public int getBlockID() { return blockID; }
    public double getLotArea() { return lotArea; }
    public double getSize() { return size; }
    public LotType getLotType() { return lotType; }//enum
    public double getPrice() { return price; }
    public LotStatus getStatus() { return status; }//enum
    public Prices getPrices() { return prices; }//class

    public void setLotID(int lotID) { this.lotID = lotID; }
    public void setBlockID(int blockID) { this.blockID = blockID; }
    public void setLotArea(double lotArea) { this.lotArea = lotArea; }
    public void setSize(double size) { this.size = size; }
    public void setLotType(LotType lotType) { this.lotType = lotType; }
    public void setPrice(double price) { this.price = price; }
    public void setStatus(LotStatus status) { this.status = status; }
    public void setPrices(Prices prices) { this.prices = prices; }
}
