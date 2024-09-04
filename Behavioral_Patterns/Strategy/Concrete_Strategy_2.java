package Behavioral_Patterns.Strategy;

public class Concrete_Strategy_2 implements  Strategy {

    @Override
    public void doSomething() {
        System.out.println(this.getClass().getSimpleName());
    }
}
