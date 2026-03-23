/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2AbstractFactory;

/**
 *
 * @author Hajan Mass
 */
public class CashierFactory implements UIFactory {
    public Button createButton() {
        return new CashierButton();
    }
    public Form createForm() {
        return new CashierForm();
    }
}
