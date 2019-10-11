package code.pattern._1_prototype.other.shallowCopy.byClone;

public class Age {
    private Integer age;

    public Age(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age{" +
                "age=" + age +
                '}';
    }
}
