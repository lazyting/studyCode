package code.pattern._1_prototype.other.deepCopy.byClone;

public class Person implements Cloneable {
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

    @Override
    protected Person clone() {
        try {
            Person person = (Person) super.clone();
            person.setAge(person.getAge().clone());
            return person;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
