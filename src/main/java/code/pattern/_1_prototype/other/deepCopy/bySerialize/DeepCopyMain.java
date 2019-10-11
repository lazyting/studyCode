package code.pattern._1_prototype.other.deepCopy.bySerialize;

import java.io.*;

/**
 * ÿһ���ÿ�����󶼽���ǳ����(ÿ������������������Զ�����clone)
 * �������ǳ�֮�޴󣡣���
 */
public class DeepCopyMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Age age = new Age(20);
        Person person1 = new Person(age, "My Name");
        //ͨ�����л�����ʵ�����
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(person1);
        oos.flush();
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
        Person person2 = (Person) ois.readObject();
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
