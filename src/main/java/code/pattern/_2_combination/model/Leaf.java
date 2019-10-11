package code.pattern._2_combination.model;

/**
 * 叶子类
 */
public class Leaf extends TreeBranch {

    private String positionName;

    public Leaf(String positionName) {
        this.positionName = positionName;
    }

    @Override
    public void cutting() {
        System.out.println("哎呀，" + positionName + "被剪掉了……");
    }
}
