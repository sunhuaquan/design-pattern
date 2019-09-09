package com.sun.dp.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.structure.flyweight.WebSiteFactory</li>
 * <li>Date : 2019-09-09 14:46</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class WebSiteFactory {

    private static final Map<String, WebSite> map = new HashMap<>();

    public static WebSite createWebSite(String type) {
        if (!map.containsKey(type)) {
            map.put(type, new WebSite(type));
        }
        return map.get(type);
    }


}
