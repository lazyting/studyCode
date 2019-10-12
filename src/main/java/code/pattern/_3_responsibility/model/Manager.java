package code.pattern._3_responsibility.model;

public class Manager extends OverTimePayHandler {

    @Override
    public void grantMoney(double number) {
        if (number < 1000) {
            System.out.println("钱只有" + number + ",经理给你报销了");
        } else {
            System.out.println("钱超过1000，经理不能给你报销了，经理需要向老板申请");
            overTimePayHandler.grantMoney(number);
        }
    }
}
