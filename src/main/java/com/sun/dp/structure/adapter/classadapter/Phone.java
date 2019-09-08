package com.sun.dp.structure.adapter.classadapter;

/**
 * @author sunhuaquan
 * @Title: Phone
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/815:10
 */
public class Phone {

    public void chage(Charge5 charge5){

        int charge = charge5.charge();
        System.out.println("电源电压="+charge);

    }
}
