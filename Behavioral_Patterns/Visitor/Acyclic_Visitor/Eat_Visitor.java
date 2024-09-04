package Behavioral_Patterns.Visitor.Acyclic_Visitor;

public class Eat_Visitor implements Animal_Visitor, Cat_Visitor, Dog_Visitor {

    @Override
    public void visit(Cat cat) {
        System.out.println("It's time to feed the cat");
    }

    @Override
    public void visit(Dog dog) {
        System.out.println("It's time to feed the dog");
    }
}
