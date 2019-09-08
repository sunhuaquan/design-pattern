package com.sun.dp.structure.adapter.objectadapter;

/**
 * @author sunhuaquan
 * @Title: Client
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/815:07
 */
public class Client {

    public static void main(String[] args){

           Phone phone=new Phone();
           phone.chage(new ChargeAdapter(new Charge220()));

    }
}
