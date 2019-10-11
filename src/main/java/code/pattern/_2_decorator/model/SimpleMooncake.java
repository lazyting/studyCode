package code.pattern._2_decorator.model;

/**
 * 简单月饼，啥都没有，花费10块
 */
public class SimpleMooncake extends Mooncake {
    @Override
    public double cost() {
        return 10;
    }

    @Override
    public String stuffing() {
        return "无馅月饼";
    }
}
