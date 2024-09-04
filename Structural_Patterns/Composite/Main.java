package Structural_Patterns.Composite;

public class Main {

    public static void main(String[] args) {

        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Leaf leaf3 = new Leaf();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.addComponent(leaf1);
        composite1.addComponent(composite2);
        composite2.addComponent(leaf2);
        composite2.addComponent(leaf3);

        Client client = new Client();
        client.setItsComponent(composite1);
        client.getItsComponent().doSomething(0);
    }
}
