package code.pattern._1_prototype.other.deepCopy.byClone;

/**
 * 每一层的每个对象都进行浅拷贝(每个对象的引用类型属性都进行clone)
 * 工程量非常之巨大！！！
 */
public class DeepCopyMain {
    public static void main(String[] args) {
        Age age = new Age(20);
        Person person1 = new Person(age, "My Name");
        Person person2 = person1.clone();
        System.out.println("person1:" + person1);
        System.out.println("person2:" + person2);
        person2.setName("New Name");
        person2.getAge().setAge(30);
        System.out.println("person1:" + person1);
        System.out.println("person2:" + person2);
//        person1:Person{age=Age{age=20}, name='My Name'}
//        person2:Person{age=Age{age=20}, name='My Name'}
//        person1:Person{age=Age{age=20}, name='My Name'}
//        person2:Person{age=Age{age=30}, name='New Name'}
    }

}
