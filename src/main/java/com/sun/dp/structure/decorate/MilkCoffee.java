package com.sun.dp.structure.decorate;

import java.math.BigDecimal;

/**
 * @author sunhuaquan
 * @Title: MilkCoffee
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/819:23
 */
public class MilkCoffee implements Coffee {

    private Coffee coffee;

    public MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getName() {
        return "牛奶"+coffee.getName();
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(10).add( coffee.getPrice());
    }
}
