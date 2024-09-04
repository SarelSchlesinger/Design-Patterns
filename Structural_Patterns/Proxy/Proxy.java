package Structural_Patterns.Proxy;

public class Proxy implements Subject {

    private Real_Subject its_Real_Subject;

    public void set_Real_Subject(Real_Subject its_Real_Subject) {
        this.its_Real_Subject = its_Real_Subject;
    }

    @Override
    public void operation(String data) {
        if (its_Real_Subject != null) {
            its_Real_Subject.operation(data + " --> Proxy");
        } else {
            System.out.println("Real_Subject is not set");
        }
    }
}
