package com.sun.dp.creater.builder;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.creater.builder.House</li>
 * <li>Date : 2019-09-06 10:26</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class House {

    private String floor;

    private String wall;

    private String windows;

    private String door;

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "House{" +
                "floor='" + floor + '\'' +
                ", wall='" + wall + '\'' +
                ", windows='" + windows + '\'' +
                ", door='" + door + '\'' +
                '}';
    }
}
