package Creational_Patterns.Factory.Factory_Method;

public class Client {

    private Animal[] itsAnimal = new Animal[2];

    public Client() {
        itsAnimal[0] = new Dog_Factory().createInstance();
        itsAnimal[1] = new Cat_Factory().createInstance();
    }
}