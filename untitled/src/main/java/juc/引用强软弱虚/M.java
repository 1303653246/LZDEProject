package juc.引用强软弱虚;

/**
 * @description:
 * @author: zsm
 * @time: 2023/4/21 11:09
 */
public class M {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize");
    }
}
