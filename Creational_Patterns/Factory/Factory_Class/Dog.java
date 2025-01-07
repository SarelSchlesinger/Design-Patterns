package Creational_Patterns.Factory.Factory_Class;

public class Dog implements Animal {
    @Override
    public void make_noise() {
        System.out.println("Woof");
    }
}