package code.pattern._2_adapter.model;

/**
 * ������Ŀ��
 */
public class HKCharger implements HKChargerInter {
    @Override
    public void charge() {
        System.out.println("ʹ��HK���������");
    }
}
