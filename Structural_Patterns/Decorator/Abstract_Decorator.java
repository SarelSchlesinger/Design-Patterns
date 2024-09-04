package Structural_Patterns.Decorator;

public abstract class Abstract_Decorator implements Component {

    private Component itsComponent;

    public Abstract_Decorator(Component itsComponent) {
        this.itsComponent = itsComponent;
    }

    @Override
    public void doSomething() {
        itsComponent.doSomething();
    }
}
