/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TransactionStructureMainFolder;

import TransactionStructureEnumFolder.NotificationStatus;
import TransactionStructureEnumFolder.NotificationType;
import UserStructureMainFolder.User;
/**
 *
 * @author User
 */
public class Notification {
    private int notificationID;
    private String message;
    private NotificationStatus status; 
    private User sender;
    private User receiver;
    private NotificationType type;
    private int referenceID;
    private String createdAt;

    public Notification(int notificationID, String message, User sender,
                        User receiver, NotificationType type, int referenceID) {
        this.notificationID = notificationID;
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
        this.type = type;
        this.referenceID = referenceID;
        this.status = NotificationStatus.UNREAD; //make enum
        this.createdAt = java.time.LocalDate.now().toString();
    }
    
//Unsure implementation
//    public void send() {
//        // implementation
//        receiver.addNotification(this);
//        System.out.println("Notification sent to " + receiver.getName() + ": " + message);
//    }

    public void markAsRead() {
        // implementation
        this.status = NotificationStatus.READ;
        System.out.println("Notification " + notificationID + " marked as read.");
    }

    public int getNotificationID() { return notificationID; }
    public String getMessage() { return message; }
    public NotificationStatus getStatus() { return status; }
    public User getSender() { return sender; }
    public User getReceiver() { return receiver; }
    public NotificationType getType() { return type; }
    public int getReferenceID() { return referenceID; }
    public String getCreatedAt() { return createdAt; }
}
