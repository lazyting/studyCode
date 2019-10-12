package code.pattern._3_command.model;

public class Switch {
    private Command command;

    public Switch(Command command) {
        this.command = command;
    }

    public void turn(Boolean b) {
        if (b) {
            command.execute();
        } else {
            command.unDo();
        }

    }
}
