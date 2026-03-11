/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PropertyStructureMainFolder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Subdivision {
    private int blocks;
    private int lots;
    private Property property; //make da class
    private List<Property> sold = new ArrayList<>(); //same here

    public Subdivision(int blocks, int lots) {
        this.blocks = blocks;
        this.lots = lots;
    }

    public int getBlocks() { return blocks; }
    public int getLots() { return lots; }
    public Property getProperty() { return property; } //same here and  below
    public List<Property> getSold() { return sold; }

    public void setBlocks(int blocks) { this.blocks = blocks; }
    public void setLots(int lots) { this.lots = lots; }
    public void setProperty(Property property) { this.property = property; }
}
