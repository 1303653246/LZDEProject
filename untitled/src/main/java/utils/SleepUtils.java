package utils;

/**
 * @description:
 * @author: zsm
 * @time: 2023/4/21 11:45
 */
public class SleepUtils {

   public static void sleepSecond(Long seconds) {
       if(seconds <= 0){
           seconds = 1L;
       }
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
