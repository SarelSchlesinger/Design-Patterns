package Behavioral_Patterns.Iterator;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list1 = List.of("elem1", "elem2", "elem3", "elem4");
        List<Double> list2 = List.of(1.0, 3.1, 4.5, 3.14);

        MyIterable<String> iterable1 = new Concrete_Iterable<>(list1);
        MyIterable<Double> iterable2 = new Concrete_Iterable<>(list2);

        Client client = new Client(iterable1);
        client.traverse();
        client.setItsIterable(iterable2);
        client.traverse();
    }
}
