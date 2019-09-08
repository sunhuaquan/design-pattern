package com.sun.dp.structure.bridge;

/**
 * @author sunhuaquan
 * @Title: HandBag
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/818:58
 */
public class HandBag extends Bag {
    @Override
    public String getName() {
        return   color.getColor()+"手提包";
    }
}
