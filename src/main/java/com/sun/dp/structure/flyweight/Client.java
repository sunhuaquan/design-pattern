package com.sun.dp.structure.flyweight;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.structure.flyweight.Client</li>
 * <li>Date : 2019-09-09 14:50</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class Client {

    public static void main(String[] args) {

        WebSite webSite = WebSiteFactory.createWebSite("博客");
        webSite.user("sunhuaquan");

        WebSite webSite2 = WebSiteFactory.createWebSite("博客");
        webSite2.user("zavfdgbfdnbht");
    }
}
