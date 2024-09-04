package Behavioral_Patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    private List<Observer> itsObservers = new ArrayList<>();
    private String state;

    protected void addObserver(Observer observer) {
        itsObservers.add(observer);
    }

    protected void removeObserver(Observer observer) {
        itsObservers.remove(observer);
    }

    protected void notifyObservers() {
        itsObservers.forEach(observer -> observer.update(state));
    }

    protected void setState(String state) {
        this.state = state;
        notifyObservers();
    }
}
