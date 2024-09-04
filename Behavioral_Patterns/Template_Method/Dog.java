package Behavioral_Patterns.Template_Method;

public class Dog extends Animal {

    @Override
    protected void eat() {
        System.out.println("It's time to feed the dog");
    }

    @Override
    protected void makeNoise() {
        System.out.println("WOOF");
    }

    @Override
    protected void sleep() {
        System.out.println("It's time to sleep");
    }

}
