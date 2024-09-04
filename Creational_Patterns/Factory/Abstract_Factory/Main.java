package Creational_Patterns.Factory.Abstract_Factory;

import java.util.Random;

public class Main {

    enum Animal_Factories {
        BLACK_ANIMAL_FACTORY,
        BROWN_ANIMAL_FACTORY
    }

    public static void main(String[] args) {

        Animal_Factories animal_factories = Animal_Factories.values()[new Random().nextInt(Animal_Factories.values().length)];
        Abstract_Animal_Factory abstract_animal_factory = animal_factories == Animal_Factories.BLACK_ANIMAL_FACTORY ? new Black_Animal_Factory() : new Brown_Animal_Factory();

        Client client = new Client(abstract_animal_factory);
    }
}
