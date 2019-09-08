package com.sun.dp.structure.adapter.objectadapter;

/**
 * @author sunhuaquan
 * @Title: ChargeAdapter
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/815:05
 */
public class ChargeAdapter implements Charge5 {


    private Charge220 charge;

    public ChargeAdapter(Charge220 charge) {
        this.charge = charge;
    }

    @Override
    public int charge() {

        return charge.charge()/44;
    }
}
