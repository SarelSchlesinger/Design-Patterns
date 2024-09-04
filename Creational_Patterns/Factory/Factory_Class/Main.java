package Creational_Patterns.Factory.Factory_Class;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();
        Animal_Factory animal_factory = new Animal_Factory();
        client.getItsAnimal()[0] = animal_factory.createAnimal("CAT");
        client.getItsAnimal()[1] = animal_factory.createAnimal("DOG");

    }
}
