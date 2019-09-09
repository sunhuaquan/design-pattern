package com.sun.dp.creater.abstractfactory;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.creater.abstractfactory.Flower</li>
 * <li>Date : 2019-09-06 15:08</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class Flower implements Plant {
    @Override
    public void color() {
        System.out.println("flower has many color");
    }
}
