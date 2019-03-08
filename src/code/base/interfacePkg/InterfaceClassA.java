package base.interfacePkg;

/**
 * Created by lzt on 2019/3/4.
 */
public interface InterfaceClassA {
    int i=0;
    String a="1";
    default void test1(){
        System.out.println("aaaa");
    }

    static void test2(){

    }
}
