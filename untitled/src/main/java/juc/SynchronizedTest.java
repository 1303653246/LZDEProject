package juc;

import org.openjdk.jol.info.ClassLayout;

/**
 * @description:
 * @author: zsm
 * @time: 2023/4/13 14:56
 */
public class SynchronizedTest {
    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        synchronized (o) {
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }
}
