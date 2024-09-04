package Behavioral_Patterns.Command;

public class Main {
    public static void main(String[] args) {

        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver();

        Command command_1 = new Concrete_Command_1(receiver);
        invoker.set_its_command(command_1);
        invoker.execute_command();

        Command command_2 = new Concrete_Command_2(receiver);
        invoker.set_its_command(command_2);
        invoker.execute_command();
    }
}
