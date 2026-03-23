/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hajan Mass
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    void attach(Observer observer) {
        observers.add(observer);
    }

    void notifyObservers(String message) {
        for (Observer obs : observers) {
            obs.update(message);
        }
    }

}
