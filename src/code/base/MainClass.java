package base;

import base.interfacePkg.InterfaceClassA;

/**
 * Created by lzt on 2019/3/4.
 */
public class MainClass {
    public static void main(String[] args) {
        InterfaceClassA interfaceClassA=new InterfaceClassA() {};
        InterfaceClassA interfaceClassa=new InterfaceClassA() {
            @Override
            public void test1() {
                System.out.println("bbbbbbbbbbbb");
            }
        };
        interfaceClassA.test1();
        interfaceClassa.test1();
    }
}
