package Structural_Patterns.Decorator;

public class Main {
    public static void main(String[] args) {

        Client client = new Client();
        client.getItsComponents()[0] = new Concrete_Component_1();
        client.getItsComponents()[1] = new Concrete_Component_2();

        new Concrete_Decorator_1(client.getItsComponents()[0]).doSomething();
        System.out.println();
        new Concrete_Decorator_2(client.getItsComponents()[1]).doSomething();
    }
}
