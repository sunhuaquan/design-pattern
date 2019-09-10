package com.sun.dp.behavior.template;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.behavior.template.Client</li>
 * <li>Date : 2019-09-10 11:02</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class Client {

    public static void main(String[] args) throws IllegalAccessException {


        UserRequest userRequest=new UserRequest();
        userRequest.setName("sxavsegbvtr");
        BaseService userService=new UserService();
        userService.execute(userRequest);


        OrderRequest orderRequest=new OrderRequest();
        BaseService orderService=new OrderService();
        orderService.execute(orderRequest);
    }
}
