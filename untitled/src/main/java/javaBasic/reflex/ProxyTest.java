package javaBasic.reflex;

/**
 * ProxyTest:
 *
 * @author: zsm
 * @time: 2023/4/23 17:55
 */
public class ProxyTest {


    public static void main(String[] args) {
        BigStar jige = new BigStar("鸡哥");
        Star proxy = ProxyStar.createProxy(jige);
        String jntm = proxy.sing("只因你太美");
        System.out.println(jntm);
        proxy.dance();
    }
}

