package Creational_Patterns.Singleton;

public class Client {

    private Singleton itsSingleton;
    private EagerSingleton itsEagerSingleton;
    private MultiSingleton itsMultiSingleton;

    public Client() {
    }

    public void setItsSingleton(Singleton itsSingleton) {
        this.itsSingleton = itsSingleton;
    }

    public void setItsEagerSingleton(EagerSingleton itsEagerSingleton) {
        this.itsEagerSingleton = itsEagerSingleton;
    }

    public void setItsMultiSingleton(MultiSingleton itsMultiSingleton) {
        this.itsMultiSingleton = itsMultiSingleton;
    }

    public Singleton getItsSingleton() {
        return itsSingleton;
    }

    public EagerSingleton getItsEagerSingleton() {
        return itsEagerSingleton;
    }

    public MultiSingleton getItsMultiSingleton() {
        return itsMultiSingleton;
    }
}