package com.sun.dp.creater.prototype;

import java.io.Serializable;

/**
 * @author sunhuaquan
 * @Title: SunWuKong
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/814:17
 */
public class Teacher implements Serializable {

    private String name;

    private String sex;

    private String alias;

    public Teacher(String name, String sex, String alias) {
        this.name = name;
        this.sex = sex;
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", alias='" + alias + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
