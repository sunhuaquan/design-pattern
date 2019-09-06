package com.sun.dp.creater.factory;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.creater.factory.FactoryMethodTest</li>
 * <li>Date : 2019-09-06 10:13</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new BJPizzaFactory();
        Pizza pizza = pizzaFactory.createPizza();
        System.out.println(pizza.getName());
    }
}
