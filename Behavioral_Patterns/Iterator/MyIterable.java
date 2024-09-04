package Behavioral_Patterns.Iterator;

public interface MyIterable<T> {

    MyIterator<T> createIterator();
}