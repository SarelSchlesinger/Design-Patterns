package Structural_Patterns.Adapter;

public class Class_Adapter extends Adaptee implements Target {

    @Override
    public void operation() {
        System.out.println("This is an operation of the Class_Adapter class");
        super.operation();
    }

}