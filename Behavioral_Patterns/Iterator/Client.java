package Behavioral_Patterns.Iterator;

public class Client {

    private MyIterable itsIterable;

    public Client(MyIterable itsIterable) {
        this.itsIterable = itsIterable;
    }

    public void setItsIterable(MyIterable itsIterable) {
        this.itsIterable = itsIterable;
    }

    public void traverse() {
        MyIterator iterator = itsIterable.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}