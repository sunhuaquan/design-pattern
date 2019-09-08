package com.sun.dp.structure.bridge;

/**
 * @author sunhuaquan
 * @Title: Client
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/819:00
 */
public class Client {

    public static void main(String[] args){


        Bag bag=new Wallet();
        bag.setColor(new Green());

        String name = bag.getName();

        System.out.println(name);
    }
}
