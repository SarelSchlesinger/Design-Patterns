package Behavioral_Patterns.Template_Method;

public abstract class Animal {

    public final void dailyRoutine() {
        wakeUp();
        eat();
        makeNoise();
        sleep();
    }

    private void wakeUp() {
        System.out.println("It's time to wake up");
    }

    protected abstract void eat();
    protected abstract void makeNoise();
    protected abstract void sleep();

}