package code.pattern.adapter.ObjectAdapter;

import code.pattern.adapter.model.HKChargerInter;
import code.pattern.adapter.model.MainlandSocket;

public class ObjectAdapter implements HKChargerInter {
    private MainlandSocket mainlandSocket = new MainlandSocket();

    @Override
    public void charge() {
        System.out.println("��ʹ��HK������");
        mainlandSocket.use();
    }
}