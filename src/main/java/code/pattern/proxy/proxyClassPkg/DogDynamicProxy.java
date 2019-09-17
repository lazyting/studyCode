package code.pattern.proxy.proxyClassPkg;


import code.pattern.proxy.interfaceImplPgk.Dog;
import code.pattern.proxy.interfacePgk.Animal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ��̬����
 * ����ھ�̬�����ŵ㣺����ʵ�ֽӿڣ���̬�����ڴ��ڹ����������
 * <p>
 * ����
 * a. ʵ��InvocationHandler�ӿڴ����Լ��ĵ��ô�����
 * b. ��Proxy���ṩClassLoader�ʹ���ӿ��������鴴����̬������
 * c. �Ե��ô���������Ϊ���������÷�����Ƶõ���̬������Ĺ��캯��
 * d. �Ե��ô���������Ϊ���������ö�̬������Ĺ��캯��������̬���������
 * <p>
 * �ŵ㣺
 * �ӿ������������з�������ת�Ƶ�����һ�������ڷ����������ʱ����Խ�����������Ҫ��̬����ÿһ��������������ת
 * ȱ����
 * ֻ֧�ֽӿڴ���
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
     * �ڲ��ഴ��InvocationHandler�ӿ�ʵ����,����һ��������
     */
    class DogInvocationHandlerImpl implements InvocationHandler {

        //��Ҫ��ʵ�����ɫ��������Ҫ����ʵ��ɫ������
        private Object target;

        public DogInvocationHandlerImpl(Object target) {
            this.target = target;
        }

        /**
         * @param proxy  ������
         * @param method ���ڴ���ķ���
         * @param args   �����Ĳ���
         * @return
         * @throws Throwable
         */
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(proxy.getClass().getName());
            System.out.println(method.getName() + "������ʼִ��");
            method.invoke(target, args);
            System.out.println(method.getName() + "����ִ�����");
            return null;
        }
    }
}

