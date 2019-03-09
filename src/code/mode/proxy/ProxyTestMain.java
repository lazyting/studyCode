package mode.proxy;

import mode.proxy.interfaceImplPgk.Dog;
import mode.proxy.interfacePgk.Animal;
import mode.proxy.proxyClassPkg.DogDynamicProxy;
import mode.proxy.proxyClassPkg.DogStaticProxy;

/**
 * Created by Lei on 2019/3/9.
 */
public class ProxyTestMain {

    public static void main(String[] args) {
//        animalStaticProxyMethod();
        animalDynamicProxyMethod();
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
