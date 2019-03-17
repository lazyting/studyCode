package code.newPoint.testPkg.methodCitation.model;

import java.time.LocalDate;
import java.util.Date;

/**
 * Created by Lei on 2019/3/16.
 */
public class Person {
    private String name;
    private LocalDate birthday;

    public Person(String name, LocalDate birthdday) {
        this.name = name;
        this.birthday = birthdday;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthdday=" + birthday +
                '}';
    }
}
