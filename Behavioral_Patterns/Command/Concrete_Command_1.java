package Behavioral_Patterns.Command;

public class Concrete_Command_1 implements Command {

    private Receiver its_receiver;

    public Concrete_Command_1(Receiver its_receiver) {
        this.its_receiver = its_receiver;
    }

    @Override
    public void execute() {
        its_receiver.action_1();
    }
}
