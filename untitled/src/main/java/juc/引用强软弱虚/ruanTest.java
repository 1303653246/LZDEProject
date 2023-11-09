package juc.引用强软弱虚;

import java.lang.ref.SoftReference;

/**
 * @description:
 * @author: zsm
 * @time: 2023/4/21 11:18
 */
public class ruanTest {
    public static void main(String[] args) throws InterruptedException {
        //软引用 多用于缓存
        SoftReference<Byte[]> softReference = new SoftReference<>(new Byte[1024 * 1024 * 10]);
        System.out.println(softReference.get());
        System.gc();
        Thread.sleep(500);
        System.out.println(softReference.get());
        //当jvm运行内存最大20m，当运行内存将要超出20m时，会先将软引用干掉
        byte[] b = new byte[1024 * 1024 * 12];
        System.out.println(softReference.get());
    }
}
