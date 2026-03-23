/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2AbstractFactory;

/**
 *
 * @author Hajan Mass
 */
public class MainApp {
    public static void main(String[] args) {
        UIFactory factory;

        // Switch factory easily
        factory = new AdminFactory();
        // factory = new CashierFactory();

        Button btn = factory.createButton();
        Form form = factory.createForm();

        btn.render();
        form.display();
    }
}
