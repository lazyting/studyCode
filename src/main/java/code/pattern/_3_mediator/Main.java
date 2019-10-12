package code.pattern._3_mediator;

import code.pattern._3_mediator.model.ChatRoom;
import code.pattern._3_mediator.model.Colleague;

public class Main {
    public static void main(String[] args) {
        Colleague zs = new Colleague("����", "���£�����");
        Colleague ls = new Colleague("����", "�Ҿ������");
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.comeIn(zs);
        chatRoom.comeIn(ls);
        chatRoom.communicate();
    }
}
