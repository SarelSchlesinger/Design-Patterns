package Structural_Patterns.Proxy;

public class Main {
    public static void main(String[] args) {

        Proxy proxy = new Proxy();
        proxy.set_Real_Subject(new Real_Subject());
        Client client = new Client(proxy);
        client.get_Subject().operation("Subject");

    }
}
