package javaBasic.lambda;

import org.junit.Test;

import java.util.*;

/**
 * @author: zsm
 * @time: 2023/4/23 9:17
 */
public class LambdaTest {

    /**
     * 接口实例
     *
     * @param :
     * @return: void
     * @author: zsm
     * @time: 2023/4/23 9:31
     */
//    @Test
//    public void test1() {
//        Comparator<Integer> integerComparator = new Comparator<>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return Integer.compare(o1, o2);
//            }
//        };
//
//        TreeSet<Integer> ts = new TreeSet<>(integerComparator);
//    }

    @Test
    public void test2() {
        TreeSet<Integer> objects = new TreeSet<>((x, y) -> Integer.compare(x, y));
    }


    /**
     * filter
     *
     * @param :
     * @return: void
     * @author: zsm
     * @time: 2023/4/23 9:31
     */

    List<Student> students = Arrays.asList(
            new Student("A11", 16, 17, 18),
            new Student("b11", 17, 17, 18),
            new Student("c11", 16, 18, 18),
            new Student("d11", 19, 17, 18),
            new Student("e11", 16, 17, 18)
    );

    @Test
    public void test3() {
        //过滤掉年龄大于16的
        List<Student> list = filterStudent(students);
        System.out.println(list);
    }

    public List<Student> filterStudent(List<Student> students) {
        ArrayList<Student> list = new ArrayList<>(10);
        for (Student student : students) {
            if (student.getAge() <= 16) {
                list.add(student);
            }
        }
        return list;
    }

    public List<Student> filterStudent2(List<Student> students,MyPre<Student> myPre) {
        ArrayList<Student> list = new ArrayList<>(10);
        for (Student student : students) {
            if (myPre.myPre(student)) {
                list.add(student);
            }
        }
        return list;
    }

    @Test
    public void test04() {
        List<Student> students = filterStudent2(this.students, (x) ->x.getAge() <= 16);
        students.forEach(System.out::println);
    }


    @Test
    public void test05(){
        //究极数据过滤
        this.students.stream()
                .filter((x)->x.getAge()<=16)
                .filter((x)->x.getSize()<18)
                .limit(1)
                .forEach(System.out::println);

        //究极数据提取
        this.students.stream()
                .map(Student::getName)
                .forEach(System.out::println);
    }
}
