package com.sun.dp.structure.decorate;

/**
 * @author sunhuaquan
 * @Title: Client
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/819:25
 */
public class Client {

    public static void main(String[] args){

        Coffee coffee=new BackCoffee();

        coffee=new MilkCoffee(coffee);

        coffee=new ChocolateCoffee(coffee);
        coffee=new ChocolateCoffee(coffee);
        System.out.println(coffee.getName()+":"+ coffee.getPrice());



    }
}
