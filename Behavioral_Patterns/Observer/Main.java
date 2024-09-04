package Behavioral_Patterns.Observer;

public class Main {

    public static void main(String[] args) {

        Observer[] observers = new Observer[]{
                new Concrete_Observer_1(),
                new Concrete_Observer_2(),
                new Concrete_Observer_3()};

        Observable[] observables = new Observable[]{
                new Concrete_Observable_1(),
                new Concrete_Observable_2()};

        observables[0].addObserver(observers[0]);
        observables[0].addObserver(observers[1]);

        observables[1].addObserver(observers[1]);
        observables[1].addObserver(observers[2]);

        observables[0].setState("new state");
        observables[1].setState("also a new state");

    }
}
