package code.pattern.builder.model;

/**
 * ����ڣ������±�
 * ����ڿ��֣�
 */
public class MoonCake {
    //��״
    private String shape;
    //����
    private String stuffing;
    //�۸�
    private double price;
    //����
    private String figure;
    //��С
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
