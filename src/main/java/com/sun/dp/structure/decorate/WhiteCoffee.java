package com.sun.dp.structure.decorate;

import java.math.BigDecimal;

/**
 * @author sunhuaquan
 * @Title: WhiteCoffee
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/819:22
 */
public class WhiteCoffee implements Coffee {

    @Override
    public String getName() {
        return "白咖啡";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(20.1);
    }
}
