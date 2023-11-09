package springIOC.service.impl;

import org.springframework.beans.factory.InitializingBean;
import springIOC.dao.UserDao;
import springIOC.service.UserService;

/**
 * UserServiceImpl:
 *
 * @author: zsm
 * @time: 2023/5/23 11:27
 */

//InitializingBean实现这个接口是为了重写afterPropertiesSet这个方法，这个方法是在构造方法之后以及属性初始化之后，实例化之前执行的方法
public class UserServiceImpl implements UserService , InitializingBean {

    private UserDao userDao;
    @Override
    public void soutUserServcie() {
        System.out.println("UserService");
    }

    public void setUserDao(UserDao userDao2){
        System.out.println(":set方法执行了");
        this.userDao = userDao2;
        userDao.soutUserDAO();
    }


//    public UserServiceImpl() {
//        System.out.println("构造方法");
//    }

        public UserServiceImpl(String name) {
        System.out.println("构造方法" + name);
    }

    public void init (){
        System.out.println("初始化方法");
    }

    public void destory (){
        System.out.println("销毁方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet执行");
    }
}
