package Creational_Patterns.Factory.Abstract_Factory;

public class Brown_Animal_Factory implements Abstract_Animal_Factory {

    @Override
    public Brown_Dog createDog() {
        System.out.println("new instance of brown dog");
        return new Brown_Dog();
    }

    @Override
    public Brown_Cat createCat() {
        System.out.println("new instance of brown cat");
        return new Brown_Cat();
    }
}
