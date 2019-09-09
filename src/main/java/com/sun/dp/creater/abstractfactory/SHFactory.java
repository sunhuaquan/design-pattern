package com.sun.dp.creater.abstractfactory;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.creater.abstractfactory.SHFactory</li>
 * <li>Date : 2019-09-06 15:02</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class SHFactory extends AbstractFactory {

    @Override
    Animal createAnimal() {
        return new Dog();
    }

    @Override
    Plant createPlant() {
        return new LvLuo();
    }
}
