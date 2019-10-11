package code.pattern._2_bridging;

import code.pattern._2_bridging.model.color.Red;
import code.pattern._2_bridging.model.cup.GlassCup;

public class Main {
    public static void main(String[] args) {
        GlassCup glassCup = new GlassCup(new Red());
        glassCup.retain();
    }
}
