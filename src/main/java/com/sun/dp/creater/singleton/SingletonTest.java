package com.sun.dp.creater.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.creater.singleton.SingletonTest</li>
 * <li>Date : 2019-09-06 9:37</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class SingletonTest {

    public static void main(String[] args){

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i=0;i<10;i++){

            executorService.submit(()->{
                Singleton singleton=Singleton.getInstanse();
                System.out.println(singleton.hashCode());

            });
        }
        executorService.shutdown();

    }
}
