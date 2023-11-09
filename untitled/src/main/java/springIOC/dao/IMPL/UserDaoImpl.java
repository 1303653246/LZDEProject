package springIOC.dao.IMPL;

import springIOC.dao.UserDao;

/**
 * UserDaoImpl:
 *
 * @author: zsm
 * @time: 2023/5/23 11:54
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void soutUserDAO() {
        System.out.println("UserDAO");
    }

}
