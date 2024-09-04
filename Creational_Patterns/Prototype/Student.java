package Creational_Patterns.Prototype;

public class Student implements Cloneable {

    private String id;

    public Student(String id) {
        this.id = id;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
