package code.pattern._1_builder;

import code.pattern._1_builder.init.MoonCaker;
import code.pattern._1_builder.model.MoonCake;

public class BuilderMain {
    public static void main(String[] args) {
        MoonCaker moonCaker = new MoonCaker();
        MoonCake moonCake = moonCaker
                .chooseFigure("�вƽ���")
                .chooseShape("Բ��")
                .chooseStuffing("ˮ��ζ").make();
        System.out.println(moonCake.toString());
    }
}
