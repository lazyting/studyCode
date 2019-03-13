package newPoint.testPkg.impl.normal;

import newPoint.testPkg.inter.normalInterface.TestInterface;
import newPoint.testPkg.inter.normalInterface.TestInterfaceAnother;

/**
 * Created by Lei on 2019/3/13.
 */
public class AClassImpl implements TestInterface,TestInterfaceAnother {

    /**
     * 若不重写此方法，编译报错
     * inherits unrelated defaults for test() from TestInterface TestInterfaceAnother
     */
    @Override
    public void test() {
        TestInterface.super.test();
        TestInterfaceAnother.super.test();
        TestInterface.test1();
        TestInterfaceAnother.test1();
    }

    public static void main(String[] args) {
        AClassImpl aClass=new AClassImpl();
        aClass.test();
    }
}
