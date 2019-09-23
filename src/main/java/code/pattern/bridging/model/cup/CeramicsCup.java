package code.pattern.bridging.model.cup;

import code.pattern.bridging.abstractPackage.Color;
import code.pattern.bridging.abstractPackage.Cup;

public class CeramicsCup extends Cup {
    public CeramicsCup(Color color) {
        super(color);
    }

    @Override
    public void retain() {
        this.color.show();
        System.out.println("杯子用来装水");
    }
}
