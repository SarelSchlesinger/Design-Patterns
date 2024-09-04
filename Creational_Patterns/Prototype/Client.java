package Creational_Patterns.Prototype;

public class Client {

    private Prototype its_prototype;

    public void set_its_prototype(Prototype its_prototype) {
        this.its_prototype = its_prototype;
    }

    public Prototype clone_prototype() throws CloneNotSupportedException {
        return its_prototype.clone();
    }
}
