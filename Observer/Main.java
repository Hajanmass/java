/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author Hajan Mass
 */
public class Main {
    public static void main(String[] args) {
        Subject channel = new Subject();

        Observer user1 = new Subscriber("User1");
        Observer user2 = new Subscriber("User2");

        channel.attach(user1);
        channel.attach(user2);

        channel.notifyObservers("New video uploaded!");
    }

}
