package com.sun.dp.structure.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

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
public class UserProxy  {

    private Object target;

    public UserProxy(Object target) {
        this.target = target;
    }

    public Object getInstance(){
        
        return  Proxy.newProxyInstance(UserProxy.class.getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("add start");
                Object invoke = method.invoke(target, args);
                System.out.println("add end");
                return invoke;
            }
        });
    }
}
