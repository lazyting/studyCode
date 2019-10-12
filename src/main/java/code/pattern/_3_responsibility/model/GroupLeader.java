package code.pattern._3_responsibility.model;

public class GroupLeader extends OverTimePayHandler {

    @Override
    public void grantMoney(double number) {
        if (number < 100) {
            System.out.println("钱只有" + number + ",组长给你报销了");
        } else {
            System.out.println("钱超过100，组长不能给你报销了，组长需要向经理申请");
            overTimePayHandler.grantMoney(number);
        }
    }
}
