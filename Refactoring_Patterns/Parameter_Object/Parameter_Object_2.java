package Refactoring_Patterns.Parameter_Object;

public class Parameter_Object_2 implements Parameter_Object {

    int a;
    int b;
    int c;

    public Parameter_Object_2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void parameter_object_do_something() {
        System.out.println(a * b - c);
    }
}