package code.pattern._2_proxy.interfaceImplPgk;


import code.pattern._2_proxy.interfacePgk.Animal;

/**
 * Created by Lei on 2019/3/9.
 */
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("�Ұ���");
    }

    @Override
    public void sleep() {
        System.out.println("�Ұ�˯");
    }

    @Override
    public void drink() {
        System.out.println("�Ұ���");
    }

    @Override
    public void play() {
        System.out.println("�Ұ���");
    }
}
