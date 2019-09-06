package com.sun.dp.creater.factory;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.creater.factory.Pizza</li>
 * <li>Date : 2019-09-06 9:45</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public abstract class Pizza {

    private String name;

    public Pizza() {
    }

    public Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
