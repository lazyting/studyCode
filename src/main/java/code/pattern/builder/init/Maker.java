package code.pattern.builder.init;

import code.pattern.builder.model.MoonCake;

public abstract class Maker {
    /**
     * 选择形状
     */
    public abstract Maker chooseShape(String shape);

    /**
     * 选择馅料
     */
    public abstract Maker chooseStuffing(String stuffing);

    /**
     * 选择价格
     */
    public abstract Maker choosePrice(double price);

    /**
     * 选择大小
     */
    public abstract Maker chooseSize(int size);

    /**
     * 选择花纹
     */
    public abstract Maker chooseFigure(String figure);

    public abstract MoonCake make();
}
