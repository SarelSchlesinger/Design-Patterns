package Behavioral_Patterns.Template_Method;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.dailyRoutine();

        Cat cat = new Cat();
        cat.dailyRoutine();
    }
}
