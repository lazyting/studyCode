package code.pattern.decorator.model;

/**
 * �±�װ����
 */
public abstract class MooncakeDecorator extends Mooncake {
    private Mooncake mooncake;

    public MooncakeDecorator(Mooncake mooncake) {
        this.mooncake = mooncake;
    }

    @Override
    public double cost() {
        return mooncake.cost();
    }

    @Override
    public String stuffing() {
        return mooncake.stuffing();
    }
}
