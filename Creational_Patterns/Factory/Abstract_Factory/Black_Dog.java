package Creational_Patterns.Factory.Abstract_Factory;

public class Black_Dog extends Dog {
    @Override
    public void make_noise() {
        super.make_noise();
        System.out.println("I'm a black dog");
    }
}
