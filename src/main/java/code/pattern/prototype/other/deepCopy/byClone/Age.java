package code.pattern.prototype.other.deepCopy.byClone;

public class Age implements Cloneable {
    private int age;

    public Age(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age{" +
                "age=" + age +
                '}';
    }

    @Override
    protected Age clone() {
        try {
            return (Age) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
