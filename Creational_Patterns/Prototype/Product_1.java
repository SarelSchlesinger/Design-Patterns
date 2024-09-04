package Creational_Patterns.Prototype;

public class Product_1 implements Prototype {

    private Student[] students = new Student[]{new Student("1"), new Student("2")};

    /**
     * Creates and returns a shallow copy of this instance
     */
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public void doSomething() {
        System.out.println(this + " --> " + students);
    }
}
