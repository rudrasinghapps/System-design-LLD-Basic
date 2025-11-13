package SystemDesign.observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private final List<Observer> observers;

    Subject() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer ob : observers) ob.update(this);
    }

}
