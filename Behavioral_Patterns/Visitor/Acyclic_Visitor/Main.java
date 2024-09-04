package Behavioral_Patterns.Visitor.Acyclic_Visitor;

public class Main {
    public static void main(String[] args) {

        Client client = new Client();
        client.getItsCat().accept(new Eat_Visitor());
        client.getItsDog().accept(new Make_Noise_Visitor());
    }
}
