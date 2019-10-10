package code.pattern.filter;

import code.pattern.filter.filterClass.PeopleAgeFilter;
import code.pattern.filter.filterClass.PeopleHeightFilter;
import code.pattern.filter.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("张三", "男", 20, 200.00, 175.00));
        personList.add(new Person("张四", "女", 21, 100.00, 170.00));
        personList.add(new Person("张五", "男", 22, 200.00, 160.00));
        personList.add(new Person("张六", "女", 23, 120.00, 171.00));
        personList.add(new Person("张七", "男", 24, 130.00, 172.00));
        personList.add(new Person("张八", "女", 25, 200.00, 169.00));
        /**
         * java 8 lambda表达式
         */
        Map<String, List<Person>> map1 = personList.stream().collect(Collectors.groupingBy(Person::getSex));//根据选取的属性的类型来决定map的key的类型：分组
        map1.forEach((k, v) -> {
            System.out.println(k + " - " + v);
        });
        Map<Integer, List<Person>> map2 = personList.stream().collect(Collectors.groupingBy(Person::getAge));//根据选取的属性的类型来决定map的key的类型：分组
        map2.forEach((k, v) -> {
            System.out.println(k + " - " + v);
        });
        List<Person> people = personList.stream().filter((p -> p.getAge() > 22)).collect(Collectors.toList());
        people.forEach(x -> {
            System.out.println(x);
        });
        Map<Integer, Person> people1 = personList.stream().filter((p -> p.getAge() > 22)).collect(Collectors.toMap(k -> k.getAge(), v -> v));
        Map<Integer, Person> people2 = personList.stream().filter((p -> p.getAge() > 22)).collect(Collectors.toMap(new Function<Person, Integer>() {
            @Override
            public Integer apply(Person o) {
                return o.getAge();
            }
        }, new Function<Person, Person>() {
            @Override
            public Person apply(Person person) {
                return person;
            }
        }));
        /**
         * 过滤器模式
         */
        PeopleAgeFilter peopleAgeFilter = new PeopleAgeFilter();
        PeopleHeightFilter peopleHeightFilter = new PeopleHeightFilter();
        peopleHeightFilter.filter(peopleAgeFilter.filter(personList));

    }
}
