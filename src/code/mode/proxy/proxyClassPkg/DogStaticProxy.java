package mode.proxy.proxyClassPkg;

import mode.proxy.interfacePgk.Animal;

/**
 * 使用代理是对原类进行增强，实际上做事的还是原类
 *
 * 优点：
 *  解耦。使业务类关注自己本身，保证了业务类的重用性
 * 缺点：
 *  1，代理对象的一个接口只服务于一种类型的对象，如果需要处理的方法很多，那就需要为每一个方法都进行代理，在程序规模稍大的情况下无法胜任
 *  如果接口增加一个方法，所有的代理类需要实现此方法，增加了代码的维护难度
 * Created by Lei on 2019/3/9.
 */
public class DogStaticProxy implements Animal {
    private Animal animal;

    public DogStaticProxy(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void eat() {
        System.out.println("eat方法开始执行");
        animal.eat();
        System.out.println("eat方法执行完毕");
    }

    @Override
    public void sleep() {
        System.out.println("sleep方法开始执行");
        animal.sleep();
        System.out.println("sleep方法执行完毕");
    }

    @Override
    public void drink() {
        System.out.println("drink方法开始执行");
        animal.drink();
        System.out.println("drink方法执行完毕");
    }

    @Override
    public void play() {
        System.out.println("play方法开始执行");
        animal.play();
        System.out.println("play方法执行完毕");
    }
}
