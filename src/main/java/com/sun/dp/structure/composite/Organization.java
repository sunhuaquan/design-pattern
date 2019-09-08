package com.sun.dp.structure.composite;

/**
 * @author sunhuaquan
 * @Title: Organization
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/820:07
 */
public interface Organization {

    String getName();

    void show();

    void add(Organization organization);

    void remove(Organization organization);


}
