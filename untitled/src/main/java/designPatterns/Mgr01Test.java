package designPatterns;

import entity.Mgr01;
import org.junit.Test;

/**
 * Mgr01Test:
 *
 * @author: zsm
 * @time: 2023/5/18 10:12
 */
public class Mgr01Test {

    @Test
    public void test01(){
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1);
        System.out.println(m1   ==  m2);
    }
}
