package juc;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 线程池
 * @author: zsm
 * @time: 2023/4/21 9:13
 */
public class ThreadPoolExecutor_Test01 {
    public static void main(String[] args) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                2,//核心线程数
                4,//最大核心线程数
                60,//线程闲置时间
                TimeUnit.SECONDS,//时间单位
                new LinkedBlockingDeque<>(4),//工作阻塞队列(必须是线程安全的)
                Executors.defaultThreadFactory(),//线程工厂（推荐自己设置）尽量不用默认工厂，默认线程名字是很鸡肋的
                new ThreadPoolExecutor.AbortPolicy()//拒绝策略，（放弃策略，直接报错）建议自定义
        );
    }
}
