package Refactoring_Patterns.Parameter_Object;

public class Parameter_Object_1 implements Parameter_Object {

    String name;
    int    id;


    public Parameter_Object_1(String name, int id) {
        this.name = name;
        this.id   = id;
    }

    @Override
    public void parameter_object_do_something() {
        System.out.println("name: " + name + ", id: " + id);
    }
}