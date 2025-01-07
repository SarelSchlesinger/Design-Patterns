package Creational_Patterns.Factory.Factory_Method;

public class Client {

    private Animal[] itsAnimal = new Animal[2];

    public Client() {
    }

    public Animal[] getItsAnimal() {
        return itsAnimal;
    }
}