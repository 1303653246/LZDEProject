package javaBasic.reflex;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ProxyStar:
 *
 * @author: zsm
 * @time: 2023/4/23 17:33
 */
public class ProxyStar {
    /* public static Object newProxyInstance(ClassLoader loader,Class<?>[] insterfaces,InvocationHandler h)
        参数一：用于指定用哪个类加载器，去加载生成的代理类
        参数二：指定接口，这些接口用于指定生成的代理，也就是哪些方法
        参数三：用于指定生成的代理对象要干什么事情
        */
    public static Star createProxy(BigStar bigStar) {
        return (Star) Proxy.newProxyInstance(
                ProxyStar.class.getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /* 参数一；代理的对象
                           参数二；要运行的方法
                           参数三：调用方法时，传递的实参
                           */
                        if ("sing".equals(method.getName())) {
                            System.out.println("准备话筒，收钱");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("准备场地，收钱");
                        }
                        return method.invoke(bigStar, args);
                    }
                }
        );
    }
}
