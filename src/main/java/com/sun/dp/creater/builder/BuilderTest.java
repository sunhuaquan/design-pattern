package com.sun.dp.creater.builder;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.creater.builder.BuilderTest</li>
 * <li>Date : 2019-09-06 10:36</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class BuilderTest {


    public static void main(String[] args) {

        Director director=new Director(new BJHouseBuilder());
        House house = director.builder();
        System.out.println(house);
    }
}
