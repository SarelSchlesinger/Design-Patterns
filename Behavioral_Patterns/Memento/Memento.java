package Behavioral_Patterns.Memento;

public class Memento {

    private String state;

    public Memento(String state_to_save) {
        this.state = state_to_save;
    }

    public String getSavedState() {
        return state;
    }
}
