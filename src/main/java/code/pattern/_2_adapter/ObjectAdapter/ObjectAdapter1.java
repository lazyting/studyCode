package code.pattern._2_adapter.ObjectAdapter;

import code.pattern._2_adapter.model.HKCharger;
import code.pattern._2_adapter.model.MainlandSocket;

public class ObjectAdapter1 extends HKCharger {
    private MainlandSocket mainlandSocket = new MainlandSocket();

    public void charge() {
        super.charge();
        mainlandSocket.use();
    }
}
