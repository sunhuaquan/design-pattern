package com.sun.dp.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunhuaquan
 * @Title: Client
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/820:14
 */
public class Client {


    public static void main(String[] args){

        Organization college=new College("计算机系");
        Organization college2=new College("金融管理");
        for (int i=0;i<10;i++) {
            Organization organization=new Department("计算机系_"+i);
            college.add(organization);
            organization=new Department("金融管理_"+i);
            college2.add(organization);
        }

        Organization organization=new University("清华大学");
        organization.add(college);
        organization.add(college2);
        organization.show();


    }






}
