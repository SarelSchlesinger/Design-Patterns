package Structural_Patterns.Flyweight;

public class Concrete_Flyweight implements Flyweight {

    private String intrinsic_property;

    public Concrete_Flyweight(String intrinsic_property) {
        this.intrinsic_property = intrinsic_property;
    }

    @Override
    public void extrinsic_property(String extrinsic_property) {
        System.out.println("intrinsic property: " + this.intrinsic_property + ", extrinsic property: " + extrinsic_property);
    }
}
