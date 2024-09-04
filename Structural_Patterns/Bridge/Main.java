package Structural_Patterns.Bridge;

public class Main {

    public static void main(String[] args) {

        Implementor implementor_1 = new Concrete_Implementor_1();
        Implementor implementor_2 = new Concrete_Implementor_2();

        Refined_Abstraction refined_abstraction = new Refined_Abstraction();

        refined_abstraction.set_implementor(implementor_1);
        refined_abstraction.abstraction_operation();

        refined_abstraction.set_implementor(implementor_2);
        refined_abstraction.abstraction_operation();


    }
}
