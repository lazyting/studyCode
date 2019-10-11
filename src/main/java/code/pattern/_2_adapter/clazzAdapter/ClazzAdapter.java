package code.pattern._2_adapter.clazzAdapter;

import code.pattern._2_adapter.model.HKChargerInter;
import code.pattern._2_adapter.model.MainlandSocket;

public class ClazzAdapter extends MainlandSocket implements HKChargerInter {
    @Override
    public void charge() {
        System.out.println("��ʹ��HK������");
        super.use();
    }
}
