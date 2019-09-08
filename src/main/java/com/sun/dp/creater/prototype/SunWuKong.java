package com.sun.dp.creater.prototype;

import java.io.*;

/**
 * @author sunhuaquan
 * @Title: SunWuKong
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/814:17
 */
public class SunWuKong implements Cloneable,Serializable{

    private String name;

    private String sex;

    private String alias;

    private Teacher teacher;

    public SunWuKong(String name, String sex, String alias) {
        this.name = name;
        this.sex = sex;
        this.alias = alias;
    }

    @Override
    protected Object clone() {

        ByteArrayOutputStream bos =null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        Object obj = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            obj = ois.readObject();
        } catch (ClassNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                bos.close();
            } catch (IOException e) {

            }
        }
        return obj;

    }

    @Override
    public String toString() {
        return "SunWuKong{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", alias='" + alias + '\'' +
                ", teacher=" + teacher +
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
