package Structural_Patterns.Decorator;

public class Concrete_Decorator_1 extends Abstract_Decorator {

    public Concrete_Decorator_1(Component itsComponent) {
        super(itsComponent);
    }

    @Override
    public void doSomething() {
        System.out.print("Concrete_Decorator_1 before ");
        super.doSomething();
    }
}
