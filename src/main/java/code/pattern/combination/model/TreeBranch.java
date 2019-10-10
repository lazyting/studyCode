package code.pattern.combination.model;

/**
 * 树枝抽象类
 */
public abstract class TreeBranch {

    /**
     * 增加树枝
     */
    public void addChildBranch(TreeBranch newTreeBranch) {
        throw new RuntimeException("无法增加子树枝");
    }

    /**
     * 减少树枝
     */
    public void removeChildBranch(TreeBranch oldTreeBranch) {
        throw new RuntimeException("无法减少子树枝");
    }

    /**
     * 获得一枝树枝
     *
     * @return
     */
    public TreeBranch getChildBranch(int i) {
        throw new RuntimeException("无法获得子树枝");
    }

    /**
     * （被）修剪树枝
     */
    public abstract void cutting();


}
