package newPoint.testPkg.inter.functionInterface;

/**
 * Created by Lei on 2019/3/14.
 */
@FunctionalInterface
public interface FuncInterfaceA {

    /**
     * @FunctionalInterface ������עһ���ӿ��Ǻ���ʽ�ӿ�
     * ��û���κ�һ�����󷽷������뱨�� �� no target method found
     * ����Ĭ�Ϸ�������������
     */
    void test();

    /**
     * ����һ�����ϵĳ��󷽷���ᵼ�±��뱨��Multiple non-overriding abstract methods found in (this.interface)
     */
//

    default void test3(){

    }
    default void test4(){

    }
}
