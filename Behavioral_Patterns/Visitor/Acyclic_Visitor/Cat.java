package Behavioral_Patterns.Visitor.Acyclic_Visitor;

public class Cat implements Animal {
    @Override
    public void accept(Animal_Visitor animal_visitor) {
        try {
            Cat_Visitor cat_visitor = (Cat_Visitor) animal_visitor;
            cat_visitor.visit(this);
        } catch (ClassCastException exception) {}
    }
}