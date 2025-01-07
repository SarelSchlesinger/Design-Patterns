package Creational_Patterns.Factory.Abstract_Factory;

public class Client {

    private Animal[] itsAnimal = new Animal[2];

    private Abstract_Animal_Factory abstract_animal_factory;

    public Client() {}

    public void set_abstract_animal_factory(Abstract_Animal_Factory abstract_animal_factory) {
        this.abstract_animal_factory = abstract_animal_factory;
    }

    public Abstract_Animal_Factory get_abstract_animal_factory() {
        return abstract_animal_factory;
    }

    public Animal[] getItsAnimal() {
        return itsAnimal;
    }
}