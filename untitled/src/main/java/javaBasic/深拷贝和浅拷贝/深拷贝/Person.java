package javaBasic.深拷贝和浅拷贝.深拷贝;

/**
 * Person:
 *
 * @author: 翟树明
 * @time: 2023/11/3 10:56
 */
public class Person {
    private Integer age;
    private String name;

    public Person() {
    }

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

