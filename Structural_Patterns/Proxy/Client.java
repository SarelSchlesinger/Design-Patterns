package Structural_Patterns.Proxy;

public class Client {

    private Proxy its_Subject;

    public Client(Proxy its_Subject) {
        this.its_Subject = its_Subject;
    }

    public Proxy get_Subject() {
        return its_Subject;
    }
}
