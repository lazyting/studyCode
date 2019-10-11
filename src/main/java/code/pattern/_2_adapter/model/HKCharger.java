package code.pattern._2_adapter.model;

/**
 * 适配器目标
 */
public class HKCharger implements HKChargerInter {
    @Override
    public void charge() {
        System.out.println("使用HK版充电器充电");
    }
}
