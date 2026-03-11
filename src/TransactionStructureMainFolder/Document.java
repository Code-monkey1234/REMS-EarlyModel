/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransactionStructureMainFolder;


import TransactionStructureEnumFolder.DocumentType;
import UserStructureMainFolder.Client;
import PropertyStructureMainFolder.Property;
/**
 *
 * @author User
 */
public class Document {
    private int documentID;
    private DocumentType type; //make enum
    private String generatedAt;
    private Client client; //import
    private Property property;//import
    private String filePath;

    public Document(int documentID, DocumentType type, String generatedAt,
                    Client client, Property property, String filePath) {
        this.documentID = documentID;
        this.type = type;
        this.generatedAt = generatedAt;
        this.client = client;
        this.property = property;
        this.filePath = filePath;
    }

    public void generate() {
        // implementation
        System.out.println("Document generated: " + type + " for " + client.getName() + " at " + filePath);
    }

    public int getDocumentID() { return documentID; }
    public DocumentType getType() { return type; }
    public String getGeneratedAt() { return generatedAt; }
    public Client getClient() { return client; }
    public Property getProperty() { return property; }
    public String getFilePath() { return filePath; }
}
