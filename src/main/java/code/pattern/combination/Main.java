package code.pattern.combination;

import code.pattern.combination.model.Leaf;
import code.pattern.combination.model.NewTreeBranch;

public class Main {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("��1ƬҶ��");
        Leaf leaf2 = new Leaf("��2ƬҶ��");
        Leaf leaf3 = new Leaf("��3ƬҶ��");
        Leaf leaf4 = new Leaf("��4ƬҶ��");
        Leaf leaf5 = new Leaf("��5ƬҶ��");
        NewTreeBranch newTreeBranch1 = new NewTreeBranch("��1����");
        NewTreeBranch newTreeBranch2 = new NewTreeBranch("��2����");
        NewTreeBranch newTreeBranch3 = new NewTreeBranch("��3����");
        NewTreeBranch newTreeBranch4 = new NewTreeBranch("��4����");
        NewTreeBranch newTreeBranch5 = new NewTreeBranch("��5����");
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
