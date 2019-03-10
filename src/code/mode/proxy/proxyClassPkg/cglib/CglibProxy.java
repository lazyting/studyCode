package mode.proxy.proxyClassPkg.cglib;

import mode.proxy.interfaceImplPgk.Dog;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib ������
 * ��̬������Ҫʵ��Ŀ��������ͬ�ӿڣ����ܵ��´�������ߴ������ǳ��Ķ࣬����ά��
 * ��̬��������˾�̬������鷳������ʵ�ֽӿڣ���̬���ڴ��д���������󣬵���ֻ�ܴ���ӿ�
 * <p>
 * cglib����
 * �ֳ�����������ڴ��й�����һ����������չĿ�����
 * ���Ҫ���಻����final������������static��final
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

        // �����Դ������Ҫ����
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
            System.out.println(method.getName() + "������ʼִ��CglibProxy");
            method.invoke(target, objects);
            System.out.println(method.getName() + "����ִ�����CglibProxy");
            return null;
        }
    }
}
