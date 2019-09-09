package com.sun.dp.structure.flyweight;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.structure.flyweight.WebSite</li>
 * <li>Date : 2019-09-09 14:46</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class WebSite {

    /**
     * 内部状态
     */
    private String type;

    public WebSite(String type) {
        this.type = type;
    }

    /**
     * desc：
     *
     * @param name 外部状态
     * @return void
     * @author sunhuaquan
     * @date 2019-09-09 15:01
     * @title
     * @since 1.0.0
     */
    public void user(String name){

         System.out.println("网站发布形式是:"+type+",使用者是:"+name);
     }
}
