package Zzz;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: Collection接口复习
 * @author: zsm
 * @time: 2023/4/13 8:35
 */
public class Collection{
    private static final ConcurrentHashMap<Integer,Integer>  concurrentHashMap = new ConcurrentHashMap<Integer,Integer>(16);
    private static final int num = 100;
    private int flagNum = 0;
    private String threadName = "";
    public static void main(String[] args) {
        //傻逼的concurrentHashMap线程测试
        {
//            Collection collection = new Collection();
//            Thread1 thread1 = collection.new Thread1();
//            Thread2 thread2 = collection.new Thread2();
//            Thread thread11 = new Thread(thread1);
//            Thread thread22 = new Thread(thread2);
//            thread11.start();
//            thread22.start();
        }
        //傻逼的concurrentHashMap和Hashmap性能测试
//        {
//            long be = System.currentTimeMillis();
//            ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>(16);
//            for (int i = 0; i <100; i++) {
//                objectObjectConcurrentHashMap.put(i,1);
//            }
//            long mid = System.currentTimeMillis();
//            System.out.println(mid - be);//0
//            System.out.println(objectObjectConcurrentHashMap);
//            long mid2 = System.currentTimeMillis();
//            HashMap<Object, Object> objectObjectHashMap = new HashMap<>(16);
//            for (int i = 0; i <100; i++) {
//                objectObjectHashMap.put(i,1);
//            }
//            long end = System.currentTimeMillis();
//            System.out.println(end - mid2);//0
//            System.out.println(objectObjectHashMap);
//        }
    }
    class Thread1 implements Runnable{

        @Override
        public void run() {
            while (flagNum <  num){
                concurrentHashMap.put(flagNum, flagNum);
                System.out.println("增加" + flagNum);
                flagNum++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }

        }
    }
    class Thread2 implements Runnable{
        @Override
        public void run() {
            while (flagNum <  num){
                concurrentHashMap.put(flagNum + 100, flagNum + 100);
                System.out.println("增加" + (flagNum + 100));
                flagNum++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
