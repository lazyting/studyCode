package code.base.threadPkg;

/**
 * synchronized
 * 1,���δ���飺ָ���������󣬶Ը����������������ͬ�������ǰҪ��ø����������
 * 2,����ʵ�������������ڵ�ǰ����ʵ������������ͬ������ǰҪ��õ�ǰ����ʵ������
 * 3,���ξ�̬�����������ڵ�ǰ��������������ͬ������ǰҪ��õ�ǰ��������
 *
 * @author lzt
 */
public class SynchronizedTest implements Runnable {

    //������Դ(�ٽ���Դ)
    static int i = 0;

    /**
     * synchronized ����ʵ������
     */
    public static synchronized Integer increase() {
        i++;
        return i;
    }

    //���ڲ��Ǿ�̬���������ǲ������˹������i������ʱ����һ�����ᷢ�����⣬����̬���������������������ʵ�������������п��ܻᵼ��i�ﲻ��Ԥ�ڵ�ֵ
    public synchronized void increaseO() {
        i++;
    }

    //���ڲ��Ǿ�̬���������ǲ������˹������i������ʱ����һ�����ᷢ�����⣬����̬���������������������ʵ�������������п��ܻᵼ��i�ﲻ��Ԥ�ڵ�ֵ
    public synchronized Integer increase1() {
        i++;
        return null;
    }

    public static Integer increase2() {
        i++;
        return null;
    }

    @Override
    public void run() {
        for (int j = 0; j < 1000000; j++) {
            increase();
        }
    }

    public static void main(String[] args) {
//        moreThreadObject();
//        oneThreadObject();
//        oneThreadObject1();
//        ClazzB clazzB=new ClazzB();
//        clazzB.run();
//        oneThreadObject2();
        new SynchronizedTest().testSynchronizedMethod();
    }

    private static void moreThreadObject() {
        Thread t1 = new Thread(new SynchronizedTest());
        Thread t2 = new Thread(new SynchronizedTest());
        t1.start();
        t2.start();
        //join����:��ǰ�߳�A�ȴ�thread�߳���ֹ֮����ܴ�thread.join()����
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }

    private static void oneThreadObject() {
        SynchronizedTest instance = new SynchronizedTest();
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        //join����:��ǰ�߳�A�ȴ�thread�߳���ֹ֮����ܴ�thread.join()����
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }

    private static void oneThreadObject1() {
        Thread t1 = new Thread(new SynchronizedTest());
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 1000000; j++) {
                    new SynchronizedTest().increaseO();
                }
            }
        });
        t1.start();
        t2.start();
        //join����:��ǰ�߳�A�ȴ�thread�߳���ֹ֮����ܴ�thread.join()����
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }

    private static void oneThreadObject2() {
        Thread t1 = new Thread(new SynchronizedTest());
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SynchronizedTest synchronizedTest = new SynchronizedTest();
                synchronized (synchronizedTest) {
                    for (int j = 0; j < 1000000; j++) {
                        synchronizedTest.increaseO();
                    }
                }
            }
        });
        t1.start();
        t2.start();
        //join����:��ǰ�߳�A�ȴ�thread�߳���ֹ֮����ܴ�thread.join()����
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(i);
    }

    private void testSynchronizedMethod(){
        final ClazzC obj = new ClazzC();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.first();
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.second();
            }
        });
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.third();
            }
        });
        t3.start();
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                obj.forth();
            }
        });
        t4.start();

    }

    class ClazzD implements Runnable {
        @Override
        public void run() {
            SynchronizedTest synchronizedTest = new SynchronizedTest();
            synchronized (synchronizedTest.increase1()) {
                for (int j = 0; j < 1000000; j++) {
                    synchronizedTest.increase1();
                }
            }
        }
    }

    public class ClazzB implements Runnable {
        @Override
        public void run() {
            Thread thread = Thread.currentThread();
            thread.checkAccess();
            System.out.println(thread.getContextClassLoader());
            System.out.println(thread.getId());
            System.out.println(thread.getName());
            System.out.println(thread.getPriority());
            System.out.println(thread.getStackTrace());
            System.out.println(thread.getThreadGroup());
            System.out.println(thread.getUncaughtExceptionHandler());
            System.out.println(thread.getState());
        }
    }
    public class ClazzC {
        public synchronized void first(){
            try {
                System.out.println("firstMethod");
                wait();
                System.out.println("firstMethod");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        public void second(){
            synchronized(this) {
                System.out.println("methodB.....");
            }
        }
        public void third() {
            String str = "sss";
            synchronized (str) {
                System.out.println("methodC.....");
            }
        }
        public synchronized void forth() {
            System.out.println("--------------");
            this.notifyAll();
        }
    }
}