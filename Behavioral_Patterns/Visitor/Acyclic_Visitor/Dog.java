package Behavioral_Patterns.Visitor.Acyclic_Visitor;

public class Dog implements Animal {
    @Override
    public void accept(Animal_Visitor animal_visitor) {
        try {
            Dog_Visitor dog_visitor = (Dog_Visitor) animal_visitor;
            dog_visitor.visit(this);
        } catch (ClassCastException exception) {}
    }
}
