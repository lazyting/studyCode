package code.pattern._2_bridging.model.cup;

import code.pattern._2_bridging.abstractPackage.Color;
import code.pattern._2_bridging.abstractPackage.Cup;

public class GlassCup extends Cup {

    public GlassCup(Color color) {
        super(color);
    }

    @Override
    public void retain() {
        this.color.show();
        System.out.println("杯子用来装水");
    }
}
