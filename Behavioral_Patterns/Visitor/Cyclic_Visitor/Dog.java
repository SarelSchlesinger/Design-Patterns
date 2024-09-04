package Behavioral_Patterns.Visitor.Cyclic_Visitor;

public class Dog implements Animal {
    @Override
    public void accept(Animal_Visitor animal_visitor) {
        animal_visitor.visit(this);
    }
}
