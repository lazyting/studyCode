package code.pattern.adapter.ObjectAdapter;

import code.pattern.adapter.model.HKCharger;
import code.pattern.adapter.model.MainlandSocket;

public class ObjectAdapter1 extends HKCharger {
    private MainlandSocket mainlandSocket = new MainlandSocket();

    public void charge() {
        super.charge();
        mainlandSocket.use();
    }
}
