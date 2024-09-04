package Behavioral_Patterns.Strategy;

public class Main {
    public static void main(String[] args) {

        Client client = new Client();
        client.setStrategy(new Concrete_Strategy_1());
        client.getStrategy().doSomething();
        client.setStrategy(new Concrete_Strategy_2());
        client.getStrategy().doSomething();

    }
}
