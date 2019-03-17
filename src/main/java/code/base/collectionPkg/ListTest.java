package code.base.collectionPkg;

import java.util.*;

/**
 * Created by lzt on 2019/3/6.
 */
public class ListTest {

    public void test() {
        List<User> list = new ArrayList<>();
        User user;
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            user = new User();
            user.setId(new Random().nextInt(3));
            user.setName("张三" + i);
            list.add(user);
        }
        long time2 = System.currentTimeMillis();
        System.out.println("存数时间：" + (time2 - time1));
        time1 = System.currentTimeMillis();
        //java8新特性
        list.stream().filter(s -> s.getId() == 2).forEach((s) -> {
            System.out.println(s);
        });
//        System.out.println(list.size());
        time2 = System.currentTimeMillis();
        System.out.println("取数时间:" + (time2 - time1));
    }

    public void remove() {
        List<Integer> integers = new ArrayList<>(5);
        integers.add(1);
        integers.add(2);
        integers.add(2);
        integers.add(4);
        integers.add(5);

        for (int i = 0; i < integers.size(); i++) {
            System.out.println("size：" + integers.size());
            if (integers.get(i) % 2 == 0) {
                System.out.println(i);
                integers.remove(i);
            }
        }
        System.out.println(integers);
    }

    /**
     * Exception in thread "main" java.lang.UnsupportedOperationException
     * Array.asList返回的是Array的内部类ArrayList（简称A1），而不是java.util.ArrayList（简称A2），A1和A2都继承自AbstractList，
     * remove，add等方法是AbstractList的方法，AbstractList对这些方法是抛出UnsupportedOperationException并且没有做任何处理，见以下代码：
     * public void add(int index, E element) {throw new UnsupportedOperationException();}
     * public E remove(int index) {throw new UnsupportedOperationException();}
     * A1没有对这些方法重写，A2对这些方法进行了重写，所有A1使用这些方法时会抛出异常。
     */
    public void testRemove3() {
        String[] strs = {"a", "b", "c", "d"};
        List<String> list = Arrays.asList("a", "b");
//        List<String> list = Arrays.asList(strs);
        //解决java.lang.UnsupportedOperationException 开始
        list = new ArrayList(list);
        //解决java.lang.UnsupportedOperationException 结束
        list.add("c");
        System.out.println(list);
    }

    /**
     * Exception in thread "main" java.util.ConcurrentModificationException
     * 每一次迭代，初始化AbstractList的Itr内部类的
     * int cursor = 0;   //将要访问的元素的索引
     * int lastRet = -1;  //上一个访问元素的索引
     * int expectedModCount = modCount;//expectedModCount为预期修改值，初始化等于modCount（AbstractList类中的一个成员变量）
     ，ArrayList的add，remove，clear的操作会让AbstractList的modCount++，
     */

    public void testRemove4(){
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");

        for (String string : strings) {
            strings.remove(string);
        }
    }

    public static void main(String[] args) {
        ListTest listTest = new ListTest();
        listTest.testRemove4();
    }

    class User {
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
class Test2 {
    static List<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        new Thread() {
            public void run() {
                Iterator<String> iterator = list.iterator();

                while (iterator.hasNext()) {
                    System.out.println(Thread.currentThread().getName() + ":"
                            + iterator.next());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
        }.start();

        new Thread() {
            public void run() {
                for (int i=list.size()-1;i>=0;i--){
                    if (("c").equals(list.get(i))) {
                        list.remove(i);
                    }
                }
//                Iterator<String> iterator = list.iterator();
//                while (iterator.hasNext()) {
//                    String element = iterator.next();
//                    System.out.println(Thread.currentThread().getName() + ":"
//                            + element);
//                    if (element.equals("c")) {
//                        iterator.remove();
//                    }
//                }
            };
        }.start();

    }
}
