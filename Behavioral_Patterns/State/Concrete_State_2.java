package Behavioral_Patterns.State;

public class Concrete_State_2 implements State {

    @Override
    public void doSomething(Client client) {
        System.out.println(this.getClass().getSimpleName() + " set state to Concrete_State_1");
        client.setState(new Concrete_State_1());

    }
}