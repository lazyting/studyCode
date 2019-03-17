package code.base.threadPkg;

/**
 * synchronized
 * 1,修饰代码块：指定加锁对象，对给定对象加锁，进入同步代码库前要获得给定对象的锁
 * 2,修饰实例方法：作用于当前对象实例加锁，进入同步代码前要获得当前对象实例的锁
 * 3,修饰静态方法：作用于当前类对象加锁，进入同步代码前要获得当前类对象的锁
 *
 * @author lzt
 */
public class SynchronizedTest implements Runnable {

    //共享资源(临界资源)
    static int i = 0;

    /**
     * synchronized 修饰实例方法
     */
    public static synchronized Integer increase() {
        i++;
        return i;
    }

    //由于不是静态方法，但是操作的了共享变量i，访问时锁不一样不会发生互斥，（静态方法是类对象锁，这里是实例方法锁），有可能会导致i达不到预期的值
    public synchronized void increaseO() {
        i++;
    }

    //由于不是静态方法，但是操作的了共享变量i，访问时锁不一样不会发生互斥，（静态方法是类对象锁，这里是实例方法锁），有可能会导致i达不到预期的值
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
        //join含义:当前线程A等待thread线程终止之后才能从thread.join()返回
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
        //join含义:当前线程A等待thread线程终止之后才能从thread.join()返回
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
        //join含义:当前线程A等待thread线程终止之后才能从thread.join()返回
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
        //join含义:当前线程A等待thread线程终止之后才能从thread.join()返回
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