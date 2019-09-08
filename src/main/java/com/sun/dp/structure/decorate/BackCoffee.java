package com.sun.dp.structure.decorate;

import java.math.BigDecimal;

/**
 * @author sunhuaquan
 * @Title: BackCoffee
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/819:22
 */
public class BackCoffee implements Coffee {
    @Override
    public String getName() {
        return "黑咖啡";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(15.0);
    }
}
