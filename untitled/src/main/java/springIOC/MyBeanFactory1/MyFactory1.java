package springIOC.MyBeanFactory1;

import springIOC.dao.IMPL.UserDaoImpl;
import springIOC.dao.UserDao;

/**
 * MyFactory1:
 *
 * @author: zsm
 * @time: 2023/5/24 14:07
 */
public interface MyFactory1 {

    public static UserDao userDao(){
        return new UserDaoImpl();
    }
}
