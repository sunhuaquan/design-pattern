package com.sun.dp.creater.abstractfactory;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.creater.abstractfactory.BJFactory</li>
 * <li>Date : 2019-09-06 15:01</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class BJFactory extends AbstractFactory {
    @Override
    Animal createAnimal() {
        return new Pig();
    }

    @Override
    Plant createPlant() {
        return new Flower();
    }
}
