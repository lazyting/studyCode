package code.mode.singleton;

/**
 * 意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 主要解决：一个全局使用的类频繁地创建与销毁。
 * 何时使用：当您想控制实例数目，节省系统资源的时候。
 * 如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建。
 * 关键代码：构造函数是私有的。
 * 应用实例：
 * 1、一个班级只有一个班主任。
 * 2、Windows是多进程多线程的，在操作一个文件的时候，就不可避免地出现多个进程或线程同时操作一个文件的现象，所以所有文件的处理必须通过唯一的实例来进行。
 * 3、一些设备管理器常常设计为单例模式，比如一个电脑有两台打印机，在输出的时候就要处理不能两台打印机打印同一个文件。
 * 优点：
 * 1、在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例（比如管理学院首页页面缓存）。
 * 2、避免对资源的多重占用（比如写文件操作）。
 * 缺点：没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。
 * 使用场景：
 * 1、要求生产唯一序列号。
 * 2、WEB中的计数器，不用每次刷新都在数据库里加一次，用单例先缓存起来。
 * 3、创建的一个对象需要消耗的资源过多，比如 I/O 与数据库的连接等。
 * <p>
 * 一般情况下，不建议使用第 2 种和第 3 种懒汉方式，建议使用第 4 种饿汉方式。
 * 只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。
 * 如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。如果有其他特殊的需求，可以考虑使用第 1 种双检锁方式。
 */
public class Singleton {

    // 1、双重校验锁实现对象单例（线程安全）
    //线程安全，Lazy初始化，但实现较复杂
//	private volatile static Singleton singleton;
//	private Singleton() {
//	}
//	public static Singleton getInstance() {
//		if (singleton == null) {
//			synchronized (Singleton.class) {
//				if (singleton == null) {
//					singleton = new Singleton();
//				}
//			}
//		}
//		return singleton;
//	}

    //2、线程不安全的懒汉式
    //Lazy初始化（：真正使用的时候才初始化），线程不安全
//	private static Singleton singleton;
//	private Singleton(){}
//	public static Singleton getInstance(){
//		if(singleton==null){
//			singleton=new Singleton();
//		}
//		return singleton;
//	}
    //3，线程安全的懒汉式
    //Lazy初始化，线程安全,但加锁会影响效率
//	private static Singleton singleton;
//	private Singleton(){}
//	public static synchronized Singleton getInstance(){
//		if(singleton==null){
//			singleton=new Singleton();
//		}
//		return singleton;
//	}
    //4,饿汉式
    //非Lazy初始化，没有加锁效率稍高，但容易产生垃圾对象（不能确定有其他的方式（或者其他的静态方法）导致类装载）
//	private static Singleton singleton=new Singleton();//饿汉式与懒汉式的区别在此
//	private Singleton(){}
//	public static Singleton getInstance(){
//		return singleton;
//	}

    //登记式/静态内部类式
    //Lazy初始化，
    private static class SingletonHolder {
        private static Singleton SINGLETON = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.SINGLETON;
    }

    public static void main(String[] args) {
        System.out.println(Singletom.Instance.getId());
    }
}

/**
 * 6，枚举式
 */
enum Singletom {
    Instance(2);
    private int id;
    private int name;
    private int age;

    private Singletom(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
