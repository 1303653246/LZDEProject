package juc.引用强软弱虚;

import utils.SleepUtils;

import java.lang.ref.WeakReference;

/**
 * @description:
 * @author: zsm
 * @time: 2023/4/21 11:42
 */
public class ruoTest {
    public static void main(String[] args) {
//        初始话弱引用   弱引用会被gc清理
        WeakReference<M> wr = new WeakReference<>(new M());
        System.out.println(wr.get());
        System.gc();
        SleepUtils.sleepSecond(1L);
        System.out.println(wr.get());
    }
}
