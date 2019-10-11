package code.pattern._2_decorator.model;

public class YolkMooncake extends MooncakeDecorator {
    public YolkMooncake(Mooncake mooncake) {
        super(mooncake);
    }

    @Override
    public double cost() {
        double a = super.cost();
        return a + 5;
    }

    @Override
    public String stuffing() {
        String stuffing = super.stuffing();
        return "����" + stuffing.substring(stuffing.indexOf("��"));
    }
}
