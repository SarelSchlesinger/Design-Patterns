package Structural_Patterns.Adapter;

public class Main {

    public static void main(String[] args) {

        Adaptee adaptee = new Adaptee();

        Target object_adapter = new Object_Adapter(adaptee);
        Target class_adapter = new Class_Adapter();

        Client client = new Client(object_adapter);
        client.doSomething();

        client.setItsTarget(class_adapter);
        client.doSomething();
    }

}
