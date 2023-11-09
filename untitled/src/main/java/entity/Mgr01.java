package entity;

/**
 * mgr01:
 *
 * @author: zsm
 * @time: 2023/5/18 10:08
 */
public class Mgr01 {

    private static final Mgr01 a = new Mgr01();

    public static Mgr01 getInstance(){
        return a;
    }

    private Mgr01() {
    }

//    public static void main(String[] args) {
//        Mgr01 m1 = Mgr01.getInstance();
//        Mgr01 m2 = Mgr01.getInstance();
//        System.out.println(m1   ==  m2);
//    }
}
