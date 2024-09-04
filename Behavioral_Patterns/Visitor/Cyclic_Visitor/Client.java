package Behavioral_Patterns.Visitor.Cyclic_Visitor;

public class Client {

    private Animal[] itsAnimals = new Animal[]{new Dog(), new Cat()};

    public Animal getItsDog() {
        return itsAnimals[0];
    }

    public Animal getItsCat() {
        return itsAnimals[1];
    }
}

