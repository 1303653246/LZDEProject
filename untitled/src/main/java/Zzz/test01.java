package Zzz;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.LocalDateTimeUtil;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * test01:
 *
 * @author: zsm
 * @time: 2023/6/9 17:00
 */
public class test01 {

    @Test
    public void test01(){
        String lastDay = DateUtil.endOfMonth(new Date()).toString().substring(0, 10);
        LocalDate now = LocalDate.now();
        System.out.println(now);
        if(lastDay.equals(now)){
            System.out.println(1);
        }else{
            System.out.println(2);
        }

        System.out.println(lastDay);
    }
    
    @Test
    public void test02(){
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time1 = formatter.format(calendar.getTime());
        calendar.add(Calendar.DATE, -1);
        String time2 = formatter.format(calendar.getTime());
        System.out.println(calendar.getTimeInMillis());
//        Calendar instance = Calendar.getInstance();
//        Calendar.
    }

    @Test
    public void test03(){
        //当前日期字符串
        String now = DateUtil.now();
        //当前时间戳 秒
        long l = DateUtil.currentSeconds();

        long current1 = DateUtil.current(false);
        long current2 = DateUtil.currentSeconds();

//        DateUtil.minute()
        System.out.println();
    }


    @Test
    public void test04(){
        String date = "2023/1/23 12:00:02";
        String parse = DateUtil.parse(date, "yyyy/MM/dd HH:mm:ss").toString();
        System.out.println();
    }

}
