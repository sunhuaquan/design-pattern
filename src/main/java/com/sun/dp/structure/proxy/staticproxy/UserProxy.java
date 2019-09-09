package com.sun.dp.structure.proxy.staticproxy;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.structure.proxy.jdkproxy.UserProxy</li>
 * <li>Date : 2019-09-09 16:13</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class UserProxy implements UserDao {

    private UserDao userDao;

    public UserProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {

        System.out.println("start transaction");
        userDao.addUser();
        System.out.println("commit transaction");
    }
}
