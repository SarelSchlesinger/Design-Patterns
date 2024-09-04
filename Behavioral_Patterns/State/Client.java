package Behavioral_Patterns.State;

public class Client {

    private State state = new Concrete_State_1(); // default state

    public void setState(State state) {
        this.state = state;
    }

    public void doSomething() {
        state.doSomething(this);
    }
}
