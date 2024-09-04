package Behavioral_Patterns.Template_Method;

public class Cat extends Animal {

    @Override
    protected void eat() {
        System.out.println("It's time to feed the cat");
    }

    @Override
    protected void makeNoise() {
        System.out.println("MEOW");
    }

    @Override
    protected void sleep() {
        System.out.println("It's time to sleep");
    }

}
