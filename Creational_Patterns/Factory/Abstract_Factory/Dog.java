package Creational_Patterns.Factory.Abstract_Factory;

abstract class Dog implements Animal {
    @Override
    public void make_noise() {
        System.out.println("Woof");
    }
}