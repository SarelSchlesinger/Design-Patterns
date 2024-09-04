package Creational_Patterns.Factory.Factory_Method;

public class Cat_Factory implements Animal_Factory {

    @Override
    public Animal createInstance() {
        System.out.println("new instance of cat");
        return new Cat();
    }
}
