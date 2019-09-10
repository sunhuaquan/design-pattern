package com.sun.dp.behavior.template;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.behavior.template.UserService</li>
 * <li>Date : 2019-09-10 10:35</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class UserService extends BaseService<UserRequest> {

    @Override
    public void invoke(UserRequest request) {

        System.out.println("add user..."+request.getName());
    }
}
