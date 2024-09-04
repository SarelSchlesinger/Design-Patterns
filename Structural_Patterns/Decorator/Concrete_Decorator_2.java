package Structural_Patterns.Decorator;

public class Concrete_Decorator_2 extends Abstract_Decorator {

    public Concrete_Decorator_2(Component itsComponent) {
        super(itsComponent);
    }

    @Override
    public void doSomething() {
        super.doSomething();
        System.out.print("before Concrete_Decorator_2");
    }
}
