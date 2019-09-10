package com.sun.dp.behavior.template;

import com.sun.dp.behavior.template.annotation.Request;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.behavior.template.BaseService</li>
 * <li>Date : 2019-09-10 10:15</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public abstract class BaseService<T> {


    public void execute(T request) throws IllegalAccessException {
        validateParams(request);
        invoke(request);
    }
    public final void validateParams(T param) throws IllegalAccessException {

        Class<?> clazz = param.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for(Field field:fields){
            if(field.isAnnotationPresent(Request.class)){
                Request request = field.getAnnotation(Request.class);
                field.setAccessible(true);
                Object o = field.get(param);
                if(!request.isNull()){
                    if(null==o){
                        throw new RuntimeException("字段:"+field.getName()+"不能为空");
                    }
                }
            }
        }
    }
    public abstract void invoke(T request);



}
