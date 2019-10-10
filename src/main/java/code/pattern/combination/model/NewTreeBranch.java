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
        System.out.println(positionName + "上长出了新树枝……");
        treeBranches.add(newTreeBranch);
    }

    @Override
    public void removeChildBranch(TreeBranch oldTreeBranch) {
//        super.removeChildBranch();
        System.out.println(positionName + "上被剪掉了老树枝……");
        treeBranches.remove(oldTreeBranch);
    }

    @Override
    public TreeBranch getChildBranch(int i) {
//        return super.getChildBranch();
        System.out.println("可以获得" + positionName + "上第" + i + "根树枝");
        return treeBranches.get(i);

    }

    @Override
    public void cutting() {
        System.out.println("对" + positionName + "进行裁剪");
        treeBranches.stream().forEach(TreeBranch::cutting);
    }
}
