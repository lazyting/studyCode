package code.pattern._3_mediator.model;

public class Colleague {
    protected String name;
    protected String message;

    public Colleague(String name, String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return name;
    }


    public String getMessage() {
        return message;
    }

}
