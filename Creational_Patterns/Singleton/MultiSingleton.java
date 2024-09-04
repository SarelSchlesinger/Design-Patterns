package Creational_Patterns.Singleton;

public class MultiSingleton {

    protected static final int MAX_INSTANCES = 3;
    protected static MultiSingleton[] instances = new MultiSingleton[MAX_INSTANCES];

    protected MultiSingleton() {
    }

    public static MultiSingleton getInstance(int instanceNumber) {

        if (instanceNumber < 0 || instanceNumber >= MAX_INSTANCES) {
            throw new IndexOutOfBoundsException("An instance number between 0 and " + (MAX_INSTANCES - 1) + " is required");
        }

        if (instances[instanceNumber] == null) {
            instances[instanceNumber] = new MultiSingleton();
        }
        return instances[instanceNumber];
    }

    public void doSomething() {
        System.out.println("MultiSingleton");
    }

}
