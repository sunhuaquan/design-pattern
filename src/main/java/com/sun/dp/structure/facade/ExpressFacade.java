package com.sun.dp.structure.facade;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.structure.facade.ExpressFacade</li>
 * <li>Date : 2019-09-09 13:56</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class ExpressFacade {

    private Package packages=new Package();

    private ExpressPerson expressPerson=new ExpressPerson();

    private ExpressCompany expressCompany=new ExpressCompany();


    public void send(){
        packages.startPackage();
        expressPerson.send();
        expressCompany.send();
    }


}
