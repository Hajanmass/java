/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2Observer;

/**
 *
 * @author Hajan Mass
 */
public class NotificationService implements Observer {
    public void update(String message) {
        System.out.println("Notification: " + message);
    }
}
