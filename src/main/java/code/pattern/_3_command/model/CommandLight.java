package code.pattern._3_command.model;

/**
 * ¿ØÖÆµÆµÄÃüÁî
 */
public class CommandLight implements Command {
    private Light light;

    public CommandLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void unDo() {
        light.close();
    }
}
