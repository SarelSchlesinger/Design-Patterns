package Structural_Patterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> itsComponent = new ArrayList<>();

    public void addComponent(Component component) {
        itsComponent.add(component);
    }

    public void removeComponent(Component component) {
        itsComponent.remove(component);
    }

    @Override
    public void doSomething(int depth) {
        System.out.println(this.getClass().getSimpleName() + " - depth level: " + ++depth);
        for (Component component : itsComponent) {
            component.doSomething(depth);
        }
    }
}
