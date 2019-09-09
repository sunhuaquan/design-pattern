package com.sun.dp.structure.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

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

    public Object create(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback((MethodInterceptor) (obj, method, args, proxy) -> {
            System.out.println("before method run...");
            Object result = proxy.invokeSuper(obj, args);
            System.out.println("after method run...");
            return result;
        });
       return enhancer.create();
    }
}
