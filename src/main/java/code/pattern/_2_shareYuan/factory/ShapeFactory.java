package code.pattern._2_shareYuan.factory;

import code.pattern._2_shareYuan.model.Circle;
import code.pattern._2_shareYuan.model.Shape;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private Map<String, Shape> shapeMap;
    //����˽�л��Լ�����
    private static ShapeFactory shapeFactory;

    private ShapeFactory() {
        shapeMap = new HashMap<>();
    }

    public Shape getCircle(String color) {
        Circle circle = (Circle) shapeMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            shapeMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

    /**
     * ����
     *
     * @return
     */
    public static ShapeFactory getInstance() {
        if (shapeFactory == null) {
            shapeFactory = new ShapeFactory();
        }
        return shapeFactory;
    }
}
