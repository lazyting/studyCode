package code.pattern._1_singleton;

/**
 * ��ͼ����֤һ�������һ��ʵ�������ṩһ����������ȫ�ַ��ʵ㡣
 * ��Ҫ�����һ��ȫ��ʹ�õ���Ƶ���ش��������١�
 * ��ʱʹ�ã����������ʵ����Ŀ����ʡϵͳ��Դ��ʱ��
 * ��ν�����ж�ϵͳ�Ƿ��Ѿ������������������򷵻أ����û���򴴽���
 * �ؼ����룺���캯����˽�еġ�
 * Ӧ��ʵ����
 * 1��һ���༶ֻ��һ�������Ρ�
 * 2��Windows�Ƕ���̶��̵߳ģ��ڲ���һ���ļ���ʱ�򣬾Ͳ��ɱ���س��ֶ�����̻��߳�ͬʱ����һ���ļ����������������ļ��Ĵ������ͨ��Ψһ��ʵ�������С�
 * 3��һЩ�豸�������������Ϊ����ģʽ������һ����������̨��ӡ�����������ʱ���Ҫ��������̨��ӡ����ӡͬһ���ļ���
 * �ŵ㣺
 * 1�����ڴ���ֻ��һ��ʵ�����������ڴ�Ŀ�����������Ƶ���Ĵ���������ʵ�����������ѧԺ��ҳҳ�滺�棩��
 * 2���������Դ�Ķ���ռ�ã�����д�ļ���������
 * ȱ�㣺û�нӿڣ����ܼ̳У��뵥һְ��ԭ���ͻ��һ����Ӧ��ֻ�����ڲ��߼�����������������ô����ʵ������
 * ʹ�ó�����
 * 1��Ҫ������Ψһ���кš�
 * 2��WEB�еļ�����������ÿ��ˢ�¶������ݿ����һ�Σ��õ����Ȼ���������
 * 3��������һ��������Ҫ���ĵ���Դ���࣬���� I/O �����ݿ�����ӵȡ�
 * <p>
 * һ������£�������ʹ�õ� 2 �ֺ͵� 3 ��������ʽ������ʹ�õ� 4 �ֶ�����ʽ��
 * ֻ����Ҫ��ȷʵ�� lazy loading Ч��ʱ���Ż�ʹ�õ� 5 �ֵǼǷ�ʽ��
 * ����漰�������л���������ʱ�����Գ���ʹ�õ� 6 ��ö�ٷ�ʽ�������������������󣬿��Կ���ʹ�õ� 1 ��˫������ʽ��
 */
public class Singleton {

    // 1��˫��У����ʵ�ֶ��������̰߳�ȫ��
    //�̰߳�ȫ��Lazy��ʼ������ʵ�ֽϸ���
//	private volatile static Singleton _1_singleton;
//	private Singleton() {
//	}
//	public static Singleton getInstance() {
//		if (_1_singleton == null) {
//			synchronized (Singleton.class) {
//				if (_1_singleton == null) {
//					_1_singleton = new Singleton();
//				}
//			}
//		}
//		return _1_singleton;
//	}

    //2���̲߳���ȫ������ʽ
    //Lazy��ʼ����������ʹ�õ�ʱ��ų�ʼ�������̲߳���ȫ
//	private static Singleton _1_singleton;
//	private Singleton(){}
//	public static Singleton getInstance(){
//		if(_1_singleton==null){
//			_1_singleton=new Singleton();
//		}
//		return _1_singleton;
//	}
    //3���̰߳�ȫ������ʽ
    //Lazy��ʼ�����̰߳�ȫ,��������Ӱ��Ч��
//	private static Singleton _1_singleton;
//	private Singleton(){}
//	public static synchronized Singleton getInstance(){
//		if(_1_singleton==null){
//			_1_singleton=new Singleton();
//		}
//		return _1_singleton;
//	}
    //4,����ʽ
    //��Lazy��ʼ����û�м���Ч���Ըߣ������ײ����������󣨲���ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ�
//	private static Singleton _1_singleton=new Singleton();//����ʽ������ʽ�������ڴ�
//	private Singleton(){}
//	public static Singleton getInstance(){
//		return _1_singleton;
//	}

    //�Ǽ�ʽ/��̬�ڲ���ʽ
    //Lazy��ʼ����
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
 * 6��ö��ʽ
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
