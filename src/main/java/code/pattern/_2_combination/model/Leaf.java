package code.pattern._2_combination.model;

/**
 * Ҷ����
 */
public class Leaf extends TreeBranch {

    private String positionName;

    public Leaf(String positionName) {
        this.positionName = positionName;
    }

    @Override
    public void cutting() {
        System.out.println("��ѽ��" + positionName + "�������ˡ���");
    }
}
