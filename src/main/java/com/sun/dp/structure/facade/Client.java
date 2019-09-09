package com.sun.dp.structure.facade;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.structure.facade.Client</li>
 * <li>Date : 2019-09-09 14:04</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class Client {

    public static void main(String[] args){

        ExpressFacade expressFacade=new ExpressFacade();
        expressFacade.send();
    }
}
