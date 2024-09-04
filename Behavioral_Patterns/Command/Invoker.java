package Behavioral_Patterns.Command;

public class Invoker {

    private Command its_command;

    public void set_its_command(Command its_command) {
        this.its_command = its_command;
    }

    public void execute_command() {
       its_command.execute();
    }
}
