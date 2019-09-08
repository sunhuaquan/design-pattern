package com.sun.dp.structure.adapter.classadapter;

/**
 * @author sunhuaquan
 * @Title: ChargeAdapter
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/815:05
 */
public class ChargeAdapter extends Charge220 implements Charge5{


    @Override
    public int charge() {

        return super.charge()/44;
    }
}
