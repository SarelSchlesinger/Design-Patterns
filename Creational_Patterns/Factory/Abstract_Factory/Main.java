package Creational_Patterns.Factory.Abstract_Factory;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();
        Abstract_Animal_Factory abstract_animal_factory = new White_Animal_Factory();
        client.set_abstract_animal_factory(abstract_animal_factory);
        client.getItsAnimal()[0] = client.get_abstract_animal_factory().createCat();
        client.getItsAnimal()[1] = client.get_abstract_animal_factory().createDog();

        client.getItsAnimal()[0].make_noise();

    }
}
