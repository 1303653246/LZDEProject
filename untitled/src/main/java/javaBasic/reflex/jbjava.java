package javaBasic.reflex;

import java.lang.reflect.Field;

/**
 * @description:
 * @author: zsm
 * @time: 2023/4/11 17:31
 */
public class jbjava {
    public static void main(String[] args) throws Exception {
        //小小反射
        Class<?> aClass = Class.forName("javaBasic.reflex.User");
        Field[] fs = aClass.getDeclaredFields();
        //对象初始化
        Object o = aClass.getDeclaredConstructor().newInstance();
        for (Field f : fs) {
            String name = f.getName();
            Field declaredField = aClass.getDeclaredField(name);
            declaredField.set(o, "1");
        }
        System.out.println(o);
    }
}
