package juc;

/**
 * @description:
 * @author: zsm
 * @time: 2023/4/20 11:59
 */
public class CacheReal {
    private static   Boolean a = true;
    public static void main(String[] args) throws InterruptedException {
        new Thread(new ThreadTest()).start();
        Thread.sleep(1000);
        a = false;
        System.out.println(a);
    }
    static class ThreadTest implements Runnable{
        @Override
        public void run() {
            System.out.println("线程开始");
            while(a){
//                System.out.println("hello");
            }
            System.out.println("线程结束");
        }
    }
}
