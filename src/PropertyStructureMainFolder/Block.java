/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PropertyStructureMainFolder;

import java.util.ArrayList;
import java.util.List;

import PropertyStructureEnumFolder.LotStatus;
/**
 *
 * @author User
 */
public class Block {
    private int blockID;
    private String blockName;
    private List<Property> lots = new ArrayList<>();
    private List<Property> availableLot = new ArrayList<>();

    public Block(int blockID, String blockName) {
        this.blockID = blockID;
        this.blockName = blockName;
    }

    public List<Property> getAvailableLots() {
        // implementation
        availableLot.clear();
        for (Property p : lots) {
            if (p.getStatus() == LotStatus.AVAILABLE) { //import enum
                availableLot.add(p);
            }
        }
        return availableLot;
    }

    public int getBlockID() { return blockID; }
    public String getBlockName() { return blockName; }
    public List<Property> getLots() { return lots; }

    public void setBlockID(int blockID) { this.blockID = blockID; }
    public void setBlockName(String blockName) { this.blockName = blockName; }
}
