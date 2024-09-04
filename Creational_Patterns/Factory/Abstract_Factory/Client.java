package Creational_Patterns.Factory.Abstract_Factory;

public class Client {

    private Animal[] itsAnimal = new Animal[2];

    public Client(Abstract_Animal_Factory abstract_animal_factory) {
        this.itsAnimal[0] = abstract_animal_factory.createDog();
        this.itsAnimal[1] = abstract_animal_factory.createCat();
    }
}