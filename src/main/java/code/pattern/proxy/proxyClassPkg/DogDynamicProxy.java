package code.pattern.proxy.proxyClassPkg;


import code.pattern.proxy.interfaceImplPgk.Dog;
import code.pattern.proxy.interfacePgk.Animal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * 相比于静态代理，优点：无需实现接口；动态的在内存在构建代理对象
 * <p>
 * 步骤
 * a. 实现InvocationHandler接口创建自己的调用处理器
 * b. 给Proxy类提供ClassLoader和代理接口类型数组创建动态代理类
 * c. 以调用处理器类型为参数，利用反射机制得到动态代理类的构造函数
 * d. 以调用处理器对象为参数，利用动态代理类的构造函数创建动态代理类对象
 * <p>
 * 优点：
 * 接口中声明的所有方法都被转移到集中一处处理，在方法数量多的时候可以进行灵活处理，不需要像静态代理每一个方法都进行中转
 * 缺憾：
 * 只支持接口代理
 * <p>
 * Created by Lei on 2019/3/9.
 */
public class DogDynamicProxy {

    Animal target = new Dog();

    public Animal getInstance() {
        InvocationHandler handler = new DogInvocationHandlerImpl(target);
        Animal proxy = (Animal) Proxy.newProxyInstance(
                new DogDynamicProxy().getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);
        return proxy;
    }

    /**
     * 内部类创建InvocationHandler接口实现类,定义一个处理类
     */
    class DogInvocationHandlerImpl implements InvocationHandler {

        //需要真实处理角色，所以需要把真实角色传进来
        private Object target;

        public DogInvocationHandlerImpl(Object target) {
            this.target = target;
        }

        /**
         * @param proxy  代理类
         * @param method 正在处理的方法
         * @param args   方法的参数
         * @return
         * @throws Throwable
         */
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(proxy.getClass().getName());
            System.out.println(method.getName() + "方法开始执行");
            method.invoke(target, args);
            System.out.println(method.getName() + "方法执行完毕");
            return null;
        }
    }
}

