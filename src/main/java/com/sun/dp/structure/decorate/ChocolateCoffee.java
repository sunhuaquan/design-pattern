package com.sun.dp.structure.decorate;

import java.math.BigDecimal;

/**
 * @author sunhuaquan
 * @Title: ChocolateCoffee
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/819:33
 */
public class ChocolateCoffee implements Coffee {

    private Coffee coffee;

    public ChocolateCoffee(Coffee coffee) {
        this.coffee = coffee;
    }


    @Override
    public String getName() {
        return "巧克力"+coffee.getName();
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(12).add(coffee.getPrice());
    }
}
