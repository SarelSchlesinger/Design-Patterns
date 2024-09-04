package Creational_Patterns.Singleton;

public class Singleton {

    protected static Singleton instance = null;

    protected Singleton() {
    }

    synchronized public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton");
    }
}