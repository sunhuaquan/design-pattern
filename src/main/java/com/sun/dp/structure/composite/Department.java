package com.sun.dp.structure.composite;

/**
 * @author sunhuaquan
 * @Title: Department
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/820:10
 */
public class Department implements Organization {

    private String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void show() {
        System.out.println(name);
    }

    @Override
    public void add(Organization organization) {

    }

    @Override
    public void remove(Organization organization) {

    }
}
