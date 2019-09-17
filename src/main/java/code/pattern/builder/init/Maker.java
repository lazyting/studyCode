package code.pattern.builder.init;

import code.pattern.builder.model.MoonCake;

public abstract class Maker {
    /**
     * ѡ����״
     */
    public abstract Maker chooseShape(String shape);

    /**
     * ѡ������
     */
    public abstract Maker chooseStuffing(String stuffing);

    /**
     * ѡ��۸�
     */
    public abstract Maker choosePrice(double price);

    /**
     * ѡ���С
     */
    public abstract Maker chooseSize(int size);

    /**
     * ѡ����
     */
    public abstract Maker chooseFigure(String figure);

    public abstract MoonCake make();
}
