package com.sun.dp.creater.abstractfactory;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.creater.abstractfactory.Pig</li>
 * <li>Date : 2019-09-06 11:48</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class Pig implements Animal {
    @Override
    public void walk() {
        System.out.println("pig slowly walk");
    }
}
