package code.newPoint.testPkg.methodCitation;

import code.newPoint.testPkg.methodCitation.model.Person;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * Created by Lei on 2019/3/16.
 */
public class Main {
    static class PersonAgeComparator implements Comparator<Person> {
        public int compare(Person a, Person b) {
            return a.getBirthday().compareTo(b.getBirthday());
        }
    }

    public static void main(String[] args) {
        Consumer consumer=System.out::println;
        consumer.accept("xxx");
        Consumer consumer1=(x)-> System.out.println(x);
        consumer1.accept("aaa");
        //传统方法排序
//        Person[] pArr = new Person[]{
//                new Person("003", LocalDate.of(2018, 9, 1)),
//                new Person("001", LocalDate.of(2018, 12, 1)),
//                new Person("002", LocalDate.of(2018, 3, 1)),
//                new Person("004", LocalDate.of(2018, 1, 1))};
//        Arrays.sort(pArr, new PersonAgeComparator());
//        System.out.println(Arrays.asList(pArr));
    }
}

class LambdaMain1 {
    public static void main(String[] args) {
        //lambda方法排序
        Person[] pArr = new Person[]{
                new Person("003", LocalDate.of(2018, 9, 1)),
                new Person("001", LocalDate.of(2018, 12, 1)),
                new Person("002", LocalDate.of(2018, 3, 1)),
                new Person("004", LocalDate.of(2018, 1, 1))};
        Arrays.sort(pArr, (Person a, Person b) -> {
            return a.getBirthday().compareTo(b.getBirthday());
        });
        System.out.println(Arrays.asList(pArr));
    }
}
class LambdaMain2 {
    public static void main(String[] args) {
        //lambda方法排序
        Person[] pArr = new Person[]{
                new Person("003", LocalDate.of(2018, 9, 1)),
                new Person("001", LocalDate.of(2018, 12, 1)),
                new Person("002", LocalDate.of(2018, 3, 1)),
                new Person("004", LocalDate.of(2018, 1, 1))};
        Arrays.sort(pArr, (Person a, Person b) -> {
            return Person.compareByAge(a,b);
        });
        System.out.println(Arrays.asList(pArr));
    }
}
class MethodCitationMain {
    public static void main(String[] args) {
        //lambda方法排序
        Person[] pArr = new Person[]{
                new Person("003", LocalDate.of(2018, 9, 1)),
                new Person("001", LocalDate.of(2018, 12, 1)),
                new Person("002", LocalDate.of(2018, 3, 1)),
                new Person("004", LocalDate.of(2018, 1, 1))};
        Arrays.sort(pArr, Person::compareByAge);
        System.out.println(Arrays.asList(pArr));
    }
}