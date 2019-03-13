package newPoint.testPkg.inter.functionInterface;

/**
 * Created by Lei on 2019/3/14.
 */
@FunctionalInterface
public interface FuncInterfaceA {

    /**
     * @FunctionalInterface 用来标注一个接口是函数式接口
     * 若没有任何一个抽象方法，编译报错 ： no target method found
     * 但是默认方法可以无限制
     */
    void test();

    /**
     * 超过一个以上的抽象方法则会导致编译报错：Multiple non-overriding abstract methods found in (this.interface)
     */
//

    default void test3(){

    }
    default void test4(){

    }
}
