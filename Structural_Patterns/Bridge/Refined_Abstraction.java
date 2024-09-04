package Structural_Patterns.Bridge;

public class Refined_Abstraction implements Abstraction {

    private Implementor itsImplementor;

    public void set_implementor(Implementor implementor) {
        this.itsImplementor = implementor;
    }

    @Override
    public void abstraction_operation() {
        System.out.println("Refined_Abstraction --> abstraction_operation()");
        itsImplementor.implementor_operation();
    }
}
