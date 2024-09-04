package Behavioral_Patterns.Visitor.Cyclic_Visitor;

public class Eat_Visitor implements Animal_Visitor {

    @Override
    public void visit(Cat cat) {
        System.out.println("It's time to feed the cat");
    }

    @Override
    public void visit(Dog dog) {
        System.out.println("It's time to feed the dog");
    }
}
