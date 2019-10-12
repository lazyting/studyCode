package code.pattern._3_responsibility.model;

public class Boss extends OverTimePayHandler {
    @Override
    public void grantMoney(double number) {
        System.out.println("钱只有" + number + ",老板给你报销了");
    }
}
