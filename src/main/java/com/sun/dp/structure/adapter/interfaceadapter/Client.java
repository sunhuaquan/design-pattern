package com.sun.dp.structure.adapter.interfaceadapter;

/**
 * @author sunhuaquan
 * @Title: Client
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/815:28
 */
public class Client {

    public static void main(String[] args){

        AbsAdapter absAdapter=new AbsAdapter() {
            @Override
            public void m3() {
               System.out.println("this is m3");
            }
        };
        absAdapter.m3();
    }
}
