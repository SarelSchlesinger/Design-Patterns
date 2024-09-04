package Structural_Patterns.Adapter;

public class Client {

    private Target itsTarget;

    public Client(Target itsTarget) {
        this.itsTarget = itsTarget;
    }

    public void setItsTarget(Target itsTarget) {
        this.itsTarget = itsTarget;
    }

    public void doSomething() {
        itsTarget.operation();
    }
}
