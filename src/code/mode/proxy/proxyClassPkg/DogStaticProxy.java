package mode.proxy.proxyClassPkg;

import mode.proxy.interfacePgk.Animal;

/**
 * ʹ�ô����Ƕ�ԭ�������ǿ��ʵ�������µĻ���ԭ��
 *
 * �ŵ㣺
 *  ���ʹҵ�����ע�Լ�������֤��ҵ�����������
 * ȱ�㣺
 *  1����������һ���ӿ�ֻ������һ�����͵Ķ��������Ҫ����ķ����ܶ࣬�Ǿ���ҪΪÿһ�����������д����ڳ����ģ�Դ��������޷�ʤ��
 *  ����ӿ�����һ�����������еĴ�������Ҫʵ�ִ˷����������˴����ά���Ѷ�
 * Created by Lei on 2019/3/9.
 */
public class DogStaticProxy implements Animal {
    private Animal animal;

    public DogStaticProxy(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void eat() {
        System.out.println("eat������ʼִ��");
        animal.eat();
        System.out.println("eat����ִ�����");
    }

    @Override
    public void sleep() {
        System.out.println("sleep������ʼִ��");
        animal.sleep();
        System.out.println("sleep����ִ�����");
    }

    @Override
    public void drink() {
        System.out.println("drink������ʼִ��");
        animal.drink();
        System.out.println("drink����ִ�����");
    }

    @Override
    public void play() {
        System.out.println("play������ʼִ��");
        animal.play();
        System.out.println("play����ִ�����");
    }
}
