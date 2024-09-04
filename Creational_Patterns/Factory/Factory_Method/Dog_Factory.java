package Creational_Patterns.Factory.Factory_Method;

public class Dog_Factory implements Animal_Factory {

    @Override
    public Animal createInstance() {
        System.out.println("new instance of dog");
        return new Dog();
    }
}
