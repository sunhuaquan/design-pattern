package com.sun.dp.structure.bridge;

/**
 * @author sunhuaquan
 * @Title: Bag
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/818:57
 */
public abstract class Bag {


    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract String getName();
}
