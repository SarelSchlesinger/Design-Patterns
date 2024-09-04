package Structural_Patterns.Adapter;

public class Object_Adapter implements Target {

    private Adaptee itsAdaptee;

    public Object_Adapter(Adaptee itsAdaptee) {
        this.itsAdaptee = itsAdaptee;
    }

    @Override
    public void operation() {
        System.out.println("This is an operation of the Object_Adapter class");
        itsAdaptee.operation();
    }
}