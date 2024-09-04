package Creational_Patterns.Factory.Abstract_Factory;

public class Black_Animal_Factory implements Abstract_Animal_Factory {

    @Override
    public Black_Dog createDog() {
        System.out.println("new instance of black dog");
        return new Black_Dog();
    }

    @Override
    public Black_Cat createCat() {
        System.out.println("new instance of black cat");
        return new Black_Cat();
    }
}