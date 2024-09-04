package Behavioral_Patterns.Observer;

public class Concrete_Observer_2 implements Observer {

    @Override
    public void update(String newState) {
        System.out.println(this.getClass().getSimpleName() + " state: " + newState);
    }
}
