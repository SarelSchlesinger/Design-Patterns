package Creational_Patterns.Factory.Factory_Method;

public class Dog implements Animal {
    @Override
    public void make_noise() {
        System.out.println("Woof");
    }
}
