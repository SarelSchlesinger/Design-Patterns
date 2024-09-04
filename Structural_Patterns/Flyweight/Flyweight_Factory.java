package Structural_Patterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Flyweight_Factory {

    private static Map<String, Flyweight> objects = new HashMap<>();

    public static Flyweight get_object(String intrinsic_property) {
        Flyweight flyweight = objects.get(intrinsic_property);
        if (flyweight == null) {
            flyweight = new Concrete_Flyweight(intrinsic_property);
            objects.put(intrinsic_property, flyweight);
        }
        return flyweight;
    }
}