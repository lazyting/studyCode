package code.pattern._3_mediator.model;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom extends Room {
    protected List<Colleague> colleagues = new ArrayList<>();

    public void comeIn(Colleague colleague) {
        System.out.println(colleague.getName() + "���뷿��");
        colleagues.add(colleague);
    }

    @Override
    public void communicate() {
        for (Colleague c : colleagues) {
            System.out.println(c.getName() + "������Ϣ˵��" + c.getMessage());
        }
    }
}
