package Behavioral_Patterns.Iterator;

import java.util.List;

public class Concrete_Iterator<T> implements MyIterator<T> {

    private List<T> nodes;
    private int position = 0;

    public Concrete_Iterator(List<T> nodes) {
        this.nodes = nodes;
    }

    @Override
    public boolean hasNext() {
        return position < nodes.size();
    }

    @Override
    public T next() {
        if (hasNext()) return nodes.get(position++);
        return null;
    }
}