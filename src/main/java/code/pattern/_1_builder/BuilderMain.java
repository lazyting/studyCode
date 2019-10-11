package code.pattern._1_builder;

import code.pattern._1_builder.init.MoonCaker;
import code.pattern._1_builder.model.MoonCake;

public class BuilderMain {
    public static void main(String[] args) {
        MoonCaker moonCaker = new MoonCaker();
        MoonCake moonCake = moonCaker
                .chooseFigure("招财进宝")
                .chooseShape("圆形")
                .chooseStuffing("水果味").make();
        System.out.println(moonCake.toString());
    }
}
