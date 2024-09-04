package Creational_Patterns.Prototype;

public class Product_2 implements Prototype {

    private Student[] students = new Student[]{new Student("1"), new Student("2")};

    /**
     * Creates and returns a deep copy of this instance
     */
    @Override
    public Prototype clone() throws CloneNotSupportedException {
        Product_2 cloned_product_2 =  (Product_2) super.clone();
        cloned_product_2.students = students.clone();
        return cloned_product_2;
    }

    public void doSomething() {
        System.out.println(this + " --> " + students);
    }
}
