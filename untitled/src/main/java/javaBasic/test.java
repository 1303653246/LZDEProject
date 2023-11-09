package javaBasic;

import cn.hutool.core.date.DateUtil;
import org.junit.Test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * test:
 *
 * @author: zsm
 * @time: 2023/5/9 8:34
 */
public class test {
    public static final ZoneOffset OFFSET = ZoneOffset.ofHours(TimeZone.getDefault().getRawOffset() / 3600000);


    @Test
    public void test(){
        SimpleDateFormat sdfYMD = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND,0); //这是将当天的【秒】设置为0
        calendar.set(Calendar.MINUTE,0); //这是将当天的【分】设置为0
        calendar.set(Calendar.HOUR_OF_DAY,0); //这是将当天的【时】设置为0
        calendar.add(Calendar.DATE,-1); //当前日期减一
        String begin = sdfYMD.format(calendar.getTime()); //2021-02-24 00:00:00
        calendar.add(Calendar.DATE,-1); //当前日期减一
        String end  = sdfYMD.format(calendar.getTime());
        System.out.println(begin);
        System.out.println(end);

        Long l = LocalDateTime.parse(begin, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toEpochSecond(OFFSET);
        System.out.println(l);

    }

    @Test
    public void test1(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        String endTime = formatter.format(calendar.getTime());
        String startDayTime = DateUtil.beginOfMonth(calendar.getTime()).toString();
        calendar.add(Calendar.DATE, -1);
        String startTime = formatter.format(calendar.getTime());

        String substring = endTime.substring(0, 10);
        String monthBegin = startDayTime.substring(0, 10);

        String startTimeInteger = startTime.substring(0, 10).replaceAll("-","");
        String  substringInteger = substring.replaceAll("-","");
        String  monthBeginInteger = monthBegin.replaceAll("-","");
        if((Integer.parseInt(monthBeginInteger ) < Integer.parseInt(substringInteger)) && (Integer.parseInt(startTimeInteger) < Integer.parseInt(monthBeginInteger ))){
            System.out.println(111);
        }else{
            System.out.println(222);

        }
    }


    @Test
    public void test02(){
        String imgUrl = "../All/images/mn1.jpg";
        Pattern pattern = Pattern.compile("[a-zA-Z0-9/.]+");
        Matcher matcher = pattern.matcher(imgUrl);
        System.out.println(matcher.matches());
        if(!matcher.matches()){
            throw new IllegalArgumentException("Invalid file name");
        }
    }
}
