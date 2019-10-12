package code.pattern._2_shareYuan;

import code.pattern._2_shareYuan.factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();
        shapeFactory.getCircle("green").draw();
        shapeFactory.getCircle("green").draw();
    }
}
