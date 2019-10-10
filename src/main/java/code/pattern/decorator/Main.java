package code.pattern.decorator;

import code.pattern.decorator.model.Mooncake;
import code.pattern.decorator.model.SimpleMooncake;
import code.pattern.decorator.model.WuRenMooncake;
import code.pattern.decorator.model.YolkMooncake;

public class Main {
    public static void main(String[] args) {
        Mooncake mooncake = new SimpleMooncake();
        WuRenMooncake wuRenMooncake = new WuRenMooncake(mooncake);
        YolkMooncake yolkMooncake = new YolkMooncake(mooncake);
        System.out.println(mooncake.stuffing() + "，花费：" + mooncake.cost());
        System.out.println(wuRenMooncake.stuffing() + "，花费：" + wuRenMooncake.cost());
        System.out.println(yolkMooncake.stuffing() + "，花费：" + yolkMooncake.cost());
    }

}
