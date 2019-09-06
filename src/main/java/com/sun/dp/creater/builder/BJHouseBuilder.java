package com.sun.dp.creater.builder;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.creater.builder.BJHouseBuilder</li>
 * <li>Date : 2019-09-06 10:59</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class BJHouseBuilder extends HouseBuilder {


    @Override
    public void builderFloor() {

        house.setFloor("白色地板");
    }

    @Override
    public void builderWall() {
        house.setWall("蓝色墙壁");
    }

    @Override
    public void builderWindows() {
        house.setWindows("变色窗户");
    }

    @Override
    public void builderDoor() {
        house.setDoor("木门");
    }
}
