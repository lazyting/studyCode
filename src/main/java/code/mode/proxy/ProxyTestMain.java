package code.mode.proxy;


import code.mode.proxy.interfaceImplPgk.Dog;
import code.mode.proxy.interfacePgk.Animal;
import code.mode.proxy.proxyClassPkg.DogDynamicProxy;
import code.mode.proxy.proxyClassPkg.DogStaticProxy;
import code.mode.proxy.proxyClassPkg.cglib.CglibProxy;

/**
 * Created by Lei on 2019/3/9.
 */
public class ProxyTestMain {

    public static void main(String[] args) {
//        animalStaticProxyMethod();
//        animalDynamicProxyMethod();
        animalCglibProxyMethod();
    }

    private static void animalCglibProxyMethod() {
        CglibProxy dogCglibProxy = new CglibProxy();
        Dog animal = (Dog) dogCglibProxy.getInstance();
        animal.eat();

    }
    private static void animalDynamicProxyMethod() {
        DogDynamicProxy dogDynamicProxy = new DogDynamicProxy();
        Animal animal = dogDynamicProxy.getInstance();
        animal.eat();

    }

    /**
     * ¾²Ì¬´úÀí
     */
    private static void animalStaticProxyMethod() {
        Animal animal = new Dog();
        DogStaticProxy dogStaticProxy = new DogStaticProxy(animal);
        dogStaticProxy.eat();
    }

}
