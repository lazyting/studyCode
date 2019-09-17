package code.pattern.builder.model;

/**
 * 中秋节，做个月饼
 * 中秋节快乐！
 */
public class MoonCake {
    //形状
    private String shape;
    //馅料
    private String stuffing;
    //价格
    private double price;
    //花纹
    private String figure;
    //大小
    private int size;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getStuffing() {
        return stuffing;
    }

    public void setStuffing(String stuffing) {
        this.stuffing = stuffing;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFigure() {
        return figure;
    }

    public void setFigure(String figure) {
        this.figure = figure;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "MoonCake{" +
                "shape='" + shape + '\'' +
                ", stuffing='" + stuffing + '\'' +
                ", price=" + price +
                ", figure='" + figure + '\'' +
                ", size=" + size +
                '}';
    }
}
