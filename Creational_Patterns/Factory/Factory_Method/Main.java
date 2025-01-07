package Creational_Patterns.Factory.Factory_Method;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();
        client.getItsAnimal()[0] = new Cat_Factory().createInstance();
        client.getItsAnimal()[1] = new Dog_Factory().createInstance();
    }
}
