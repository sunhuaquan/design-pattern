package com.sun.dp.structure.proxy.jdkproxy;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.structure.proxy.jdkproxy.Client</li>
 * <li>Date : 2019-09-09 16:47</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class Client {

    public static void main(String[] args) {

        UserProxy userProxy=new UserProxy(new UserDaoImpl());

        UserDao userDao = (UserDao) userProxy.getInstance();

        userDao.addUser();
    }
}
