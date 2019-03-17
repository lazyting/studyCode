package code.newPoint.testPkg.inter.normalInterface;

/**
 * Created by Lei on 2019/3/13.
 */
public interface TestInterfaceAnother {

    default void test() {
        System.out.println("test another Method");
    }

    static void test1() {
        System.out.println("test1 another Method");
    }
}
