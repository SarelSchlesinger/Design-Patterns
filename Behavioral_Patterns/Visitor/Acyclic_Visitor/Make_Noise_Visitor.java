package Behavioral_Patterns.Visitor.Acyclic_Visitor;

public class Make_Noise_Visitor implements Animal_Visitor, Cat_Visitor, Dog_Visitor {

    @Override
    public void visit(Cat cat) {
        System.out.println("Meow");
    }

    @Override
    public void visit(Dog dog) {
        System.out.println("Woof");
    }

}
