/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2Observer;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hajan Mass
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();

        Observer display = new StockDisplay();
        Observer notification = new NotificationService();

        stock.attach(display);
        stock.attach(notification);

        stock.setStockLevel(50);
        stock.setStockLevel(30);
    }
}
