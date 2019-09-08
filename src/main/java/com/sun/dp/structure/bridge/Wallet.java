package com.sun.dp.structure.bridge;

/**
 * @author sunhuaquan
 * @Title: Wallet
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/818:59
 */
public class Wallet extends Bag {
    @Override
    public String getName() {
        return color.getColor()+ "Wallet";
    }
}
