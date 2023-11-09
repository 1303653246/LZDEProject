package juc.引用强软弱虚;

import java.io.IOException;

/**
 * @description:
 * @author: zsm
 * @time: 2023/4/21 11:08
 */
public class qiangTest {
    //强应用，手动gc调用回收失去应用的垃圾
    public static void main(String[] args) throws IOException {
        M m = new M();
        m = null;
        System.gc();
        //阻塞main线程，给垃圾回收线程时间执行
        System.in.read();
        System.out.println("111");
    }
}
