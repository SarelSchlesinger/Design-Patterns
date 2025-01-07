package Creational_Patterns.Factory.Abstract_Factory;

abstract class Cat implements Animal {
    @Override
    public void make_noise() {
        System.out.println("Meow");
    }
}