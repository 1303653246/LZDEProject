package javaBasic.lambda.streamApi;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * StreamTest:
 *
 * @author: zsm
 * @time: 2023/5/4 13:44
 */
public class StreamTest {

    @Test
    public void test01(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");




        Date date = new Date();
        String nowTime = format.format(date);
        Calendar calendar = Calendar.getInstance();
        calendar .setTime(date);
        calendar .add(Calendar.DATE, -1);
        String beforeDay = format.format(calendar .getTime());

    }
}
