package code.pattern.decorator.model;

public class WuRenMooncake extends MooncakeDecorator {

    public WuRenMooncake(Mooncake mooncake) {
        super(mooncake);
    }

    @Override
    public double cost() {
        double a = super.cost();
        return a + 10;
    }

    @Override
    public String stuffing() {
        String stuffing = super.stuffing();
        return "ŒÂ» " + stuffing.substring(stuffing.indexOf("œ⁄"));
    }
}
