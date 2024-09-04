package Behavioral_Patterns.Memento;

public class Main {
    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.setState("first state");
        caretaker.save_state(originator);
        originator.setState("second state");
        caretaker.save_state(originator);
        originator.setState("third state");
        caretaker.restore_state(originator);
        System.out.println(originator.getState());
        caretaker.restore_state(originator);
        System.out.println(originator.getState());
    }
}
