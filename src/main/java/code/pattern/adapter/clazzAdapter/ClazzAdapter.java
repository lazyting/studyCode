package code.pattern.adapter.clazzAdapter;

import code.pattern.adapter.model.HKChargerInter;
import code.pattern.adapter.model.MainlandSocket;

public class ClazzAdapter extends MainlandSocket implements HKChargerInter {
    @Override
    public void charge() {
        System.out.println("想使用HK版充电器");
        super.use();
    }
}
