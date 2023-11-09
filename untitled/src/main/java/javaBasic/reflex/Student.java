package javaBasic.reflex;

/**
 * Student:
 *
 * @author: zsm
 * @time: 2023/4/24 8:40
 */
public class Student {
    private Integer age;
    private String name;

    public Student() {
    }

    private Student (Integer age){
        this.age = age;
    }

    protected Student (String name){
        this.name = name;
    }

    private Student(Integer age, String name) {
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

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
