package code.pattern._3_responsibility.model;

public class Boss extends OverTimePayHandler {
    @Override
    public void grantMoney(double number) {
        System.out.println("Ǯֻ��" + number + ",�ϰ���㱨����");
    }
}
