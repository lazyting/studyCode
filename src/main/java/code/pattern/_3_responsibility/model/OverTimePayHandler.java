package code.pattern._3_responsibility.model;

public abstract class OverTimePayHandler {
    protected OverTimePayHandler overTimePayHandler;

    public void setOverTimePayHandler(OverTimePayHandler overTimePayHandler) {
        this.overTimePayHandler = overTimePayHandler;
    }

    public abstract void grantMoney(double number);
}
