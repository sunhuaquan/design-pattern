package com.sun.dp.behavior.template;

import com.sun.dp.behavior.template.annotation.Request;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.behavior.template.UserRequest</li>
 * <li>Date : 2019-09-10 10:43</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class UserRequest {

    @Request(isNull = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
