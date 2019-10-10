package code.pattern.combination;

import code.pattern.combination.model.Leaf;
import code.pattern.combination.model.NewTreeBranch;

public class Main {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("第1片叶子");
        Leaf leaf2 = new Leaf("第2片叶子");
        Leaf leaf3 = new Leaf("第3片叶子");
        Leaf leaf4 = new Leaf("第4片叶子");
        Leaf leaf5 = new Leaf("第5片叶子");
        NewTreeBranch newTreeBranch1 = new NewTreeBranch("第1根叉");
        NewTreeBranch newTreeBranch2 = new NewTreeBranch("第2根叉");
        NewTreeBranch newTreeBranch3 = new NewTreeBranch("第3根叉");
        NewTreeBranch newTreeBranch4 = new NewTreeBranch("第4根叉");
        NewTreeBranch newTreeBranch5 = new NewTreeBranch("第5根叉");
        newTreeBranch1.addChildBranch(leaf1);
        newTreeBranch1.addChildBranch(leaf2);
        newTreeBranch1.addChildBranch(leaf3);
        newTreeBranch1.addChildBranch(leaf4);
        newTreeBranch1.addChildBranch(leaf5);

        newTreeBranch2.addChildBranch(leaf1);
        newTreeBranch2.addChildBranch(leaf2);
        newTreeBranch2.addChildBranch(leaf3);
        newTreeBranch2.addChildBranch(leaf4);
        newTreeBranch2.addChildBranch(leaf5);

        newTreeBranch3.addChildBranch(leaf1);
        newTreeBranch3.addChildBranch(leaf2);
        newTreeBranch3.addChildBranch(leaf3);
        newTreeBranch3.addChildBranch(leaf4);
        newTreeBranch3.addChildBranch(leaf5);

        newTreeBranch4.addChildBranch(leaf1);
        newTreeBranch4.addChildBranch(leaf2);
        newTreeBranch4.addChildBranch(leaf3);
        newTreeBranch4.addChildBranch(leaf4);
        newTreeBranch4.addChildBranch(leaf5);

        newTreeBranch5.addChildBranch(leaf1);
        newTreeBranch5.addChildBranch(leaf2);
        newTreeBranch5.addChildBranch(leaf3);
        newTreeBranch5.addChildBranch(leaf4);
        newTreeBranch5.addChildBranch(leaf5);

        newTreeBranch1.cutting();
    }
}
