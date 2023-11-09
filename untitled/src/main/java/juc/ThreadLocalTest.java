package juc;

import utils.SleepUtils;

/**
 * @description:
 * @author: zsm
 * @time: 2023/4/21 11:58
 */
public class ThreadLocalTest {
    static ThreadLocal<Person> tl = new ThreadLocal<>();
    //ThreadLocal这个东西可以看作一个线程内部得容器，可见性只对当前容器    线程隔离用的
    //源码是key、value,只能设置一对键值对，（看源码）每个ThreadLocal都有自己的一个map，都是以ThreadLocal自身作为key保证唯一性。
    //1.key使用弱引用，保证key不会出现内存泄漏
    //2.使用tl.remove(),保证value不会出现内存泄漏
    static class Person {
        String name = "zhangsan";
        public Person(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        new Thread(() -> {
            SleepUtils.sleepSecond(1L);
            tl.set(new Person("lisi"));
            System.out.println(tl.get());
            //这ThreadLocal在使用set()方法后，结束前一定要tl.remove()
            tl.remove();
        }).start();
        new Thread(() -> {
            SleepUtils.sleepSecond(2L);
            System.out.println(tl.get());
        }).start();
    }
}
