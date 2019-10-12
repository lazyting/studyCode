package code.pattern._3_command;

import code.pattern._3_command.model.CommandLight;
import code.pattern._3_command.model.Light;
import code.pattern._3_command.model.Switch;

public class Main {
    public static void main(String[] args) {

        Switch s = new Switch(new CommandLight(new Light()));
        s.turn(true);
        s.turn(false);
    }
}
