package code.pattern._2_decorator;

import code.pattern._2_decorator.model.Mooncake;
import code.pattern._2_decorator.model.SimpleMooncake;
import code.pattern._2_decorator.model.WuRenMooncake;
import code.pattern._2_decorator.model.YolkMooncake;

public class Main {
    public static void main(String[] args) {
        Mooncake mooncake = new SimpleMooncake();
        WuRenMooncake wuRenMooncake = new WuRenMooncake(mooncake);
        YolkMooncake yolkMooncake = new YolkMooncake(mooncake);
        System.out.println(mooncake.stuffing() + "�����ѣ�" + mooncake.cost());
        System.out.println(wuRenMooncake.stuffing() + "�����ѣ�" + wuRenMooncake.cost());
        System.out.println(yolkMooncake.stuffing() + "�����ѣ�" + yolkMooncake.cost());
    }

}
