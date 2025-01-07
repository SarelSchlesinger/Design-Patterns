package Creational_Patterns.Factory.Abstract_Factory;

public class White_Animal_Factory implements Abstract_Animal_Factory {

    @Override
    public White_Dog createDog() {
        System.out.println("new instance of white dog");
        return new White_Dog();
    }

    @Override
    public White_Cat createCat() {
        System.out.println("new instance of white cat");
        return new White_Cat();
    }
}
