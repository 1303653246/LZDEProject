package javaBasic.lambda.streamApi;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author: zsm
 * @time: 2023/4/23 11:52
 */
public class StreamCreate {
    @Test
    public void test01() {
        //1.流可以通过一部分集合.stream()得方法创建
        //2.可以通过stream.of()方法创建流，括号中的是泛型
//        Stream.iterate(0,(x) -> x + 2).limit(10).forEach(System.out::println);
        Stream.of("asd", "dfg", "ghj").map(x -> x.toUpperCase()).forEach(System.out::println);
    }

    //需求 计算0到1亿的和
    @Test
    public void test02() {
        Instant start = Instant.now();
        long num = 0L;
        for (long i = 0; i < 100000000L; i++) {
            num += 1;
        }
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis());
    }

    //并行流和顺序流
    @Test
    public void test03() {
        Instant start = Instant.now();
        //只有数据量特别大的时候才会用这种并行流
        long reduce = LongStream.rangeClosed(0, 10000000000L).parallel().reduce(0, Long::sum);
        System.out.println(reduce);
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end).toMillis());
    }
}
