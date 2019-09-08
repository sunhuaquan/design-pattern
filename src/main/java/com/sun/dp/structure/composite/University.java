package com.sun.dp.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunhuaquan
 * @Title: University
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/820:08
 */
public class University implements Organization {

    private String name;

    private List<Organization> organizations = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void show() {

        System.out.println("---------------" + name + "---------------");
        for (Organization item : organizations) {
            item.show();
        }
    }


    @Override
    public void add(Organization organization) {
        organizations.add(organization);
    }

    @Override
    public void remove(Organization organization) {
        organizations.remove(organization);
    }
}
