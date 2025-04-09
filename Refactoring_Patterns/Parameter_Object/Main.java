package Refactoring_Patterns.Parameter_Object;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();
        client.client_do_something(new Parameter_Object_1("Moshe", 12));
        client.client_do_something(new Parameter_Object_2(3, 4, 6));

    }
}