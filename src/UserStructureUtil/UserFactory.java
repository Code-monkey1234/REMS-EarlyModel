/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserStructureUtil;
import UserStructureMainFolder.User;
import UserStructureMainFolder.Client;
import UserStructureMainFolder.Agent;
import UserStructureMainFolder.RealEstate;
import UserStructureEnum.Role;

/**
 *
 * @author User
 */
public class UserFactory {
    public static User register(
        int userID,
        String name,
        String email,
        int phoneNumber,
        String password,//also known as passwordSetted kasi register, ipapass nalang sa constructor ng user and it will be password setted, then login jst compares password eneterd to setted
        Role role
    ) {
        switch (role) {
            case CLIENT:
                return new Client(userID, name, email, phoneNumber, password);

            case AGENT:
                return new Agent(userID, name, email, phoneNumber, password);

            case ADMIN:
                return new RealEstate(userID, name, email, phoneNumber, password);

            default:
                throw new IllegalArgumentException("Invalid role.");
        }
    }
}
