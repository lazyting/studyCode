package code.pattern._2_adapter.ObjectAdapter;

import code.pattern._2_adapter.model.HKChargerInter;
import code.pattern._2_adapter.model.MainlandSocket;

public class ObjectAdapter implements HKChargerInter {
    private MainlandSocket mainlandSocket = new MainlandSocket();

    @Override
    public void charge() {
        System.out.println("��ʹ��HK������");
        mainlandSocket.use();
    }
}