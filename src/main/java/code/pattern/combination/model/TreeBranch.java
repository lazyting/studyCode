package code.pattern.combination.model;

/**
 * ��֦������
 */
public abstract class TreeBranch {

    /**
     * ������֦
     */
    public void addChildBranch(TreeBranch newTreeBranch) {
        throw new RuntimeException("�޷���������֦");
    }

    /**
     * ������֦
     */
    public void removeChildBranch(TreeBranch oldTreeBranch) {
        throw new RuntimeException("�޷���������֦");
    }

    /**
     * ���һ֦��֦
     *
     * @return
     */
    public TreeBranch getChildBranch(int i) {
        throw new RuntimeException("�޷��������֦");
    }

    /**
     * �������޼���֦
     */
    public abstract void cutting();


}
