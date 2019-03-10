package mode.proxy.proxyClassPkg.cglib;

import mode.proxy.interfaceImplPgk.Dog;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib 操作类
 * 静态代理：需要实现目标对象的相同接口，可能导致代理类或者代理方法非常的多，不易维护
 * 动态代理：解决了静态代理的麻烦，无需实现接口，动态在内存中创建代理对象，但是只能代理接口
 * <p>
 * cglib代理：
 * 又称子类代理，在内存中构建出一个子类来扩展目标对象
 * 这就要求，类不能是final，方法不能是static和final
 * <p>
 * Created by Lei on 2019/3/10.
 */
public class CglibProxy {

    public Object getInstance() {
        Dog dog = new Dog();
        Dog dogFactory = (Dog) new ProxyFactory(dog).getProxyInstance();
        return dogFactory;
    }

    class ProxyFactory implements MethodInterceptor {

        // 代理的源对象，需要传入
        private Object target;

        public ProxyFactory(Object target) {
            this.target = target;
        }

        public Object getProxyInstance() {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(target.getClass());
            enhancer.setCallback(this);
            return enhancer.create();
        }

        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            System.out.println(method.getName() + "方法开始执行CglibProxy");
            method.invoke(target, objects);
            System.out.println(method.getName() + "方法执行完毕CglibProxy");
            return null;
        }
    }
}
