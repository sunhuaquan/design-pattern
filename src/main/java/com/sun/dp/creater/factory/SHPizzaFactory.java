package com.sun.dp.creater.factory;


/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.creater.abstractfactory.SHPizzaFactory</li>
 * <li>Date : 2019-09-06 10:23</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class SHPizzaFactory extends PizzaFactory{
    @Override
    public Pizza createPizza() {
        return new SHPizza("上海");
    }
}
