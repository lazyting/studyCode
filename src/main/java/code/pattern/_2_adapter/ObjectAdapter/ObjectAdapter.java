package code.pattern._2_adapter.ObjectAdapter;

import code.pattern._2_adapter.model.HKChargerInter;
import code.pattern._2_adapter.model.MainlandSocket;

public class ObjectAdapter implements HKChargerInter {
    private MainlandSocket mainlandSocket = new MainlandSocket();

    @Override
    public void charge() {
        System.out.println("想使用HK版充电器");
        mainlandSocket.use();
    }
}