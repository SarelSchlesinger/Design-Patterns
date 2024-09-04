package Structural_Patterns.Composite;

public class Leaf implements Component {

    @Override
    public void doSomething(int depth) {
        System.out.println(this.getClass().getSimpleName() + " - depth level: " + ++depth);
    }
}
