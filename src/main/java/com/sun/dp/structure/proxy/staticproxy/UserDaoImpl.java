package com.sun.dp.structure.proxy.staticproxy;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.structure.proxy.jdkproxy.UserDaoImpl</li>
 * <li>Date : 2019-09-09 16:15</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("add user........");
    }
}
