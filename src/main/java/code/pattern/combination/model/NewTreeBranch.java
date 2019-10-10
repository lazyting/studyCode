package code.pattern.combination.model;

import java.util.ArrayList;
import java.util.List;

public class NewTreeBranch extends TreeBranch {
    private List<TreeBranch> treeBranches = new ArrayList<>();

    private String positionName;

    public NewTreeBranch(String positionName) {
        this.positionName = positionName;
    }

    @Override
    public void addChildBranch(TreeBranch newTreeBranch) {
//        super.addChildBranch();
        System.out.println(positionName + "�ϳ���������֦����");
        treeBranches.add(newTreeBranch);
    }

    @Override
    public void removeChildBranch(TreeBranch oldTreeBranch) {
//        super.removeChildBranch();
        System.out.println(positionName + "�ϱ�����������֦����");
        treeBranches.remove(oldTreeBranch);
    }

    @Override
    public TreeBranch getChildBranch(int i) {
//        return super.getChildBranch();
        System.out.println("���Ի��" + positionName + "�ϵ�" + i + "����֦");
        return treeBranches.get(i);

    }

    @Override
    public void cutting() {
        System.out.println("��" + positionName + "���вü�");
        treeBranches.stream().forEach(TreeBranch::cutting);
    }
}
