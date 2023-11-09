package javaBasic.lambda;

/**
 * @author: zsm
 * @time: 2023/4/23 9:32
 */
public class Student {

    private String name;
    private Integer age;
    private Integer size;
    private Integer salary;

    public Student() {
    }

    public Student(String name, Integer age, Integer size, Integer salary) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", size=" + size +
                ", salary=" + salary +
                '}';
    }
}
