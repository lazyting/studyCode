package code.pattern._2_proxy;


import code.pattern._2_proxy.interfaceImplPgk.Dog;
import code.pattern._2_proxy.interfacePgk.Animal;
import code.pattern._2_proxy.proxyClassPkg.DogDynamicProxy;
import code.pattern._2_proxy.proxyClassPkg.DogStaticProxy;
import code.pattern._2_proxy.proxyClassPkg.cglib.CglibProxy;

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
