package com.sun.dp.creater.prototype;

/**
 * @author sunhuaquan
 * @Title: Client
 * @ProjectName design-pattern
 * @Description: TODO
 * @date 2019/9/814:24
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {


        SunWuKong sunWuKong = new SunWuKong("孙悟空", "男", "齐天大圣");

        Teacher teacher = new Teacher("唐曾", "男", "唐三藏");

        sunWuKong.setTeacher(teacher);

        SunWuKong clone = (SunWuKong) sunWuKong.clone();

        System.out.println(clone);

        Teacher teacher1 = clone.getTeacher();

        System.out.println(teacher1==teacher);

    }
}
