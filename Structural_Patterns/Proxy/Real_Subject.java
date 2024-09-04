package Structural_Patterns.Proxy;

public class Real_Subject implements Subject {

    @Override
    public void operation(String data) {
        System.out.println(data + " --> Real_Subject");
    }
}
