package juc;

import cn.hutool.crypto.asymmetric.Sign;
import org.junit.Test;
import utils.SleepUtils;

import java.util.concurrent.atomic.AtomicReference;

/**
 * ZiXuanLock:
 *
 * @author: zsm
 * @time: 2023/6/27 14:51
 */
public class ZiXuanLock {


        // 定义一个原子引用变量
        private AtomicReference<Thread> sign = new AtomicReference<>();

        public void lock(){
            Thread current = Thread.currentThread();
//            System.out.println("当前线程为：" + current.getName());
            // 加锁时：若sign为null，则设置为current；若sihn不为空，则进入循环，自旋等待；
            while(!sign.compareAndSet(null, current)){
                System.out.println("自旋锁开始自旋" );
                // 自旋：Do Nothing！！
            }
        }

        public void unlock (){
            Thread current = Thread.currentThread();
            // 解锁时：sign的值一定为current，所以直接把sign设置为null。
            // 这样其他线程就可以拿到锁了（跳出循环）。
            sign.compareAndSet(current, null);
            System.out.println("放锁" );

        }

        @Test
        public void test(){
            sign.set(null);
        Thread thread1 = new Thread(() -> {
            System.out.println(2);
            lock();
            for (int i = 0; i < 100; i++) {

            }
            unlock();
        });
        Thread thread2 = new Thread(() -> {
            lock();
            for (int i = 0; i < 100; i++) {

            }
            unlock();
        });
            System.out.println(1);
        thread1.setName("线程1");
        thread2.setName("线程2");
        thread1.start();
        thread2.start();
    }

}
