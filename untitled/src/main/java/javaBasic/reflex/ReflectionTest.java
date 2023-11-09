package javaBasic.reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.stream.Stream;

/**
 * ReflectionTest:
 *
 * @author: zsm
 * @time: 2023/4/24 8:42
 */
public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    //  获取Class对象的三种方式
    // （1）Class.forName("全类名") 最常用
    // （2）类名.class  一般参数传递
    // （3）对象.getClass()  有对象才使用

        Class<?> aClass = Class.forName("javaBasic.reflex.Student");

        //获取所有公共构造方法
//        Constructor<?>[] constructors = aClass.getConstructors();
//        Stream.of(constructors).forEach(System.out::println);

        //获取所有的构造方法
//        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
//        Stream.of(declaredConstructors).forEach(System.out::println);

        //获取单个构造方法
//        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();a
//        System.out.println(declaredConstructor);

        //获取单个有参数的构造方法
//        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class);
//        System.out.println(declaredConstructor);
//
//        Constructor<?> declaredConstructor1 = aClass.getDeclaredConstructor(Integer.class);
//        System.out.println(declaredConstructor1);

        Constructor<?> declaredConstructor2 = aClass.getDeclaredConstructor(Integer.class, String.class);
//        System.out.println(declaredConstructor2);

        //获取修饰符代表的数字
//        int modifiers = declaredConstructor2.getModifiers();
//        System.out.println(modifiers);

        //获取参数
        Parameter[] parameters = declaredConstructor2.getParameters();
        Stream.of(parameters).forEach(System.out::println);

        //创建对象
        //临时取消权限的校验
        declaredConstructor2.setAccessible(true);
        Student student = (Student) declaredConstructor2.newInstance(1, "张三");
        System.out.println(student);

//        Class<Student> studentClass = Student.class;
//
//        Student student = new Student();
//        Class<? extends Student> aClass1 = student.getClass();
//
//        System.out.println(aClass == studentClass);
//        System.out.println(aClass == aClass1);
    }
}
