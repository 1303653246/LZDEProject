package juc;

import java.util.concurrent.CountDownLatch;

/**
 * @description:
 * @author: zsm
 * @time: 2023/4/20 14:12
 */
public class CacheHangIsReal {
    public static long COUNT = 1000000000L;
    /*一个缓存行的字节是64,一个long类型的字节是8*/
    public static class T {
        private long p1, p2, p3, p4, p5, p6, p7;
        public long x = 0L;
        private long p8, p9, p10, p11, p12, p13, p14;
    }
    public static T[] arr = new T[2];
    static {
        arr[0] = new T();
        arr[1] = new T();
    }
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        Thread t1 = new Thread(() -> {
            for (long i = 0; i < COUNT; i++) {
                arr[0].x = i;
            }
            countDownLatch.countDown();
        });
        Thread t2 = new Thread(() -> {
            for (long i = 0; i < COUNT; i++) {
                arr[1].x = i;
            }
            countDownLatch.countDown();
        });
        final long start = System.nanoTime();
        t1.start();
        t2.start();
        countDownLatch.await();
        System.out.println((System.nanoTime() - start) / 1000000);
    }
}
