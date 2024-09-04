package Creational_Patterns.Prototype;

public interface Prototype extends Cloneable {

    Prototype clone() throws CloneNotSupportedException;
}
