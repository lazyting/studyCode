package code.pattern.bridging.abstractPackage;

public abstract class Cup {
    protected Color color;

    public Cup(Color color) {
        this.color = color;
    }

    public abstract void retain();
}
