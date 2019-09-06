package com.sun.dp.creater.builder;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.creater.builder.Director</li>
 * <li>Date : 2019-09-06 11:00</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class Director {

    private HouseBuilder houseBuilder;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House builder() {

        houseBuilder.builderFloor();
        houseBuilder.builderDoor();
        houseBuilder.builderWall();
        houseBuilder.builderWindows();
        return houseBuilder.getResult();
    }
}
