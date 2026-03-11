/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserStructureMainFolder;

import java.util.ArrayList;
import java.util.List;   

import TransactionStructureMainFolder.Notification;


/**
 *
 * @author User
 */

//errors [just notif class not created]
public abstract class User {
    
    private int userID;
    private String name;
    private String email;
    private int phoneNumber;
    private String password;
    private List<Notification> notifications = new ArrayList<>();

    
    //constructor para ma fill in ung mga fields and ma access din
    public User(int userID, String name, String email, int phoneNumber, String password) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
    
    
    //if password equals password setted
    public boolean login(String emailEntered, String passwordEntered ) {
        return this.password.equals(passwordEntered) && this.email.equals(emailEntered);// compares stored vs entered 
    }
    
    //exits the frame siguro idk the logic
    public void logout(){
        System.out.println("You have logged out");
    }
    
    //viewing notifications (displayed in a table sa jframe?)
    public void viewNotifications(){
        //to remove error (create da notif class and the notif methods kasi theyr called here
//        System.out.println("=======Notifications======");
//        for(Notification n : notifications){
//            System.out.println(n.getMessage() + "[" + n.getStatus() + "]");
//        }
    }//end of notif view notif method
    
    
    //getteres and setters
    public int getUserID() { return userID; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public int getPhoneNumber() { return phoneNumber; }
    public String getPassword() { return password; }
    public List<Notification> getNotifications() { return notifications; } //create notif class to remove eror

    public void setUserID(int userID) { this.userID = userID; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPhoneNumber(int phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setPassword(String password) { this.password = password; }
}
