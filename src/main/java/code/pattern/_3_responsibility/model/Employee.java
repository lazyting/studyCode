package code.pattern._3_responsibility.model;

public class Employee {
    private OverTimePayHandler overTimePayHandler;

    public void setOverTimePayHandler(OverTimePayHandler overTimePayHandler) {
        this.overTimePayHandler = overTimePayHandler;
    }

    public void requestOverTimePay(double money) {
        overTimePayHandler.grantMoney(money);
    }
}
