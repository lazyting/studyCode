package code.pattern._2_decorator.model;

/**
 * ���±���ɶ��û�У�����10��
 */
public class SimpleMooncake extends Mooncake {
    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String stuffing() {
        return "�����±�";
    }
}
