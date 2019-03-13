package newPoint.testPkg.inter.normalInterface;

/**
 * Created by Lei on 2019/3/13.
 */
public interface TestInterface {

    default void test() {
        System.out.println("test Method");
    }

    static void test1() {
        System.out.println("test1 Method");
    }
}
