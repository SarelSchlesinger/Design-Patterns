package Structural_Patterns.Flyweight;

public class Client {

    public static void main(String[] args) {

        Flyweight flyweight_1 = Flyweight_Factory.get_object("1");
        flyweight_1.extrinsic_property("A");
        Flyweight flyweight_2 = Flyweight_Factory.get_object("2");
        flyweight_2.extrinsic_property("B");
        Flyweight flyweight_3 = Flyweight_Factory.get_object("3");
        flyweight_3.extrinsic_property("C");
    }
}
