package code.pattern.bridging;

import code.pattern.bridging.model.color.Red;
import code.pattern.bridging.model.cup.GlassCup;

public class Main {
    public static void main(String[] args) {
        GlassCup glassCup = new GlassCup(new Red());
        glassCup.retain();
    }
}
