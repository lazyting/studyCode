package code.pattern._3_responsibility.model;

public class GroupLeader extends OverTimePayHandler {

    @Override
    public void grantMoney(double number) {
        if (number < 100) {
            System.out.println("Ǯֻ��" + number + ",�鳤���㱨����");
        } else {
            System.out.println("Ǯ����100���鳤���ܸ��㱨���ˣ��鳤��Ҫ��������");
            overTimePayHandler.grantMoney(number);
        }
    }
}
