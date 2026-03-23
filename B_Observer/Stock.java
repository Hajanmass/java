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
public class Stock {
    private List<Observer> observers = new ArrayList<>();
    private int stockLevel;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer obs : observers) {
            obs.update(message);
        }
    }

    public void setStockLevel(int level) {
        this.stockLevel = level;
        notifyObservers("Stock updated to: " + level);
    }
}
