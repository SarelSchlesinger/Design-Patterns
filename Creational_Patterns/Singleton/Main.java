package Creational_Patterns.Singleton;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();

        // Creational_Patterns.Singleton
        client.setItsSingleton(Singleton.getInstance());
        client.getItsSingleton().doSomething();

        // EagerSingleton
        client.setItsEagerSingleton(EagerSingleton.getInstance());
        client.getItsEagerSingleton().doSomething();

        // MultiSingleton
        client.setItsMultiSingleton(MultiSingleton.getInstance(0));
        client.setItsMultiSingleton(MultiSingleton.getInstance(1));
        client.setItsMultiSingleton(MultiSingleton.getInstance(2));
        client.getItsMultiSingleton().doSomething();


    }
}
