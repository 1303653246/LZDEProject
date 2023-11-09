package javaBasic.reflex;

/**
 * @description:
 * @author: zsm
 * @time: 2023/4/11 16:57
 */
public class User {

    public String a;
    public String b;

    public User(String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "User{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }


}
