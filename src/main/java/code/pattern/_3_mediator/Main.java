package code.pattern._3_mediator;

import code.pattern._3_mediator.model.ChatRoom;
import code.pattern._3_mediator.model.Colleague;

public class Main {
    public static void main(String[] args) {
        Colleague zs = new Colleague("张三", "有事，速来");
        Colleague ls = new Colleague("李四", "我尽快赶来");
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.comeIn(zs);
        chatRoom.comeIn(ls);
        chatRoom.communicate();
    }
}
