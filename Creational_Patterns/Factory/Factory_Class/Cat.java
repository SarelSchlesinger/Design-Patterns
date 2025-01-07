package Creational_Patterns.Factory.Factory_Class;

public class Cat implements Animal {
    @Override
    public void make_noise() {
        System.out.println("Meow");
    }
}