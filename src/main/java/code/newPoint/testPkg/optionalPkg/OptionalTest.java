package code.newPoint.testPkg.optionalPkg;

import java.util.Optional;
import java.util.function.Function;

/**
 * Created by Lei on 2019/3/17.
 */
public class OptionalTest {
    public static void main(String[] args) {
        User user = new User();
        user.getName();

        user = null;
        System.out.println(getUserName2(user));
    }

    /**
     * 由于没有对User进行判空，容易报空指针异常
     *
     * @param user
     * @return
     */
    private static String getUserName(User user) {
        return user.getName();
    }

    /**
     * 原始判空方法
     *
     * @param user
     * @return
     */
    private static String getUserName1(User user) {
        if (user != null) {
            return user.getName();
        }
        return null;
    }

    private static String getUserName2(User user) {
        Optional<User> optional = Optional.ofNullable(user);
        return optional.map(User::getName).orElse(null);
    }
}

class User {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
