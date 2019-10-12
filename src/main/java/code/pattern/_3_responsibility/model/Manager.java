package code.pattern._3_responsibility.model;

public class Manager extends OverTimePayHandler {

    @Override
    public void grantMoney(double number) {
        if (number < 1000) {
            System.out.println("Ǯֻ��" + number + ",������㱨����");
        } else {
            System.out.println("Ǯ����1000�������ܸ��㱨���ˣ�������Ҫ���ϰ�����");
            overTimePayHandler.grantMoney(number);
        }
    }
}
