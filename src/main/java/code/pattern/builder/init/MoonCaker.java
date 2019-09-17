package code.pattern.builder.init;

import code.pattern.builder.model.MoonCake;

public class MoonCaker extends Maker {

    private MoonCake moonCake;

    public MoonCaker() {
        this.moonCake = new MoonCake();
    }

    @Override
    public MoonCaker chooseShape(String shape) {
        moonCake.setShape(shape);
        return this;
    }

    @Override
    public MoonCaker chooseStuffing(String stuffing) {
        moonCake.setStuffing(stuffing);
        return this;
    }

    @Override
    public MoonCaker choosePrice(double price) {
        moonCake.setPrice(price);
        return this;
    }

    @Override
    public MoonCaker chooseSize(int size) {
        moonCake.setSize(size);
        return this;
    }

    @Override
    public MoonCaker chooseFigure(String figure) {
        moonCake.setFigure(figure);
        return this;
    }

    @Override
    public MoonCake make() {
        return this.moonCake;
    }
}
