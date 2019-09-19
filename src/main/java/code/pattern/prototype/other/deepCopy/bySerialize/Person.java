package code.pattern.prototype.other.deepCopy.bySerialize;

import java.io.Serializable;

public class Person implements Serializable {

    private Age age;
    private String name;

    public Person(Age age, String name) {
        this.age = age;
        this.name = name;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
