package com.sun.dp.creater.singleton;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.creater.singleton.Singleton</li>
 * <li>Date : 2019-09-06 9:35</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class Singleton {

    private Singleton(){

    }

    private static class SingletonHolder{

        public static Singleton instance=new Singleton();
    }

    public static Singleton getInstanse(){

        return SingletonHolder.instance;
    }

}
