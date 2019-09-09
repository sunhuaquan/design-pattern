package com.sun.dp.creater.builder;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.creater.builder.HouseBuilder</li>
 * <li>Date : 2019-09-06 10:32</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public abstract class HouseBuilder {

    protected House house=new House();

    public abstract void builderFloor();

    public abstract void builderWall();

    public abstract void builderWindows();

    public abstract void builderDoor();

    public  House getResult(){
        return house;
    }
}
