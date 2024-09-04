package Behavioral_Patterns.Memento;

import java.util.Stack;

public class Caretaker {

    private Stack<Memento> saved_states = new Stack<>();

    public void save_state(Originator originator) {
        saved_states.push(originator.saveState());
    }

    public void restore_state(Originator originator) {
        if (!saved_states.empty()) {
            originator.restoreState(saved_states.pop());
        }
    }
}
