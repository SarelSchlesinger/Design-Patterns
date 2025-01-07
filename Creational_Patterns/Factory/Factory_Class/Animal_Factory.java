package Creational_Patterns.Factory.Factory_Class;

public class Animal_Factory {

    public Animal createAnimal(String animal) {
        Animal animal_instance;
        switch (animal.toLowerCase()) {
            case "dog" -> {
                animal_instance = new Dog();
                System.out.println("new instance of dog");
            }
            case "cat" -> {
                animal_instance = new Cat();
                System.out.println("new instance of cat");
            }
            default -> throw new IllegalArgumentException("Unexpected value: " + animal);
        }
        return animal_instance;
    }

}