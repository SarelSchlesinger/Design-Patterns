package Behavioral_Patterns.Iterator;

import java.util.List;

public class Concrete_Iterable<T> implements MyIterable<T> {

    private List<T> nodes;

    public Concrete_Iterable(List<T> nodes) {
        this.nodes = nodes;
    }

    @Override
    public MyIterator createIterator() {
        return new Concrete_Iterator<>(nodes);
    }
}