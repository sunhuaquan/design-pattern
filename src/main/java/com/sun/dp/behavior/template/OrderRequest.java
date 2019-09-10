package com.sun.dp.behavior.template;

import com.sun.dp.behavior.template.annotation.Request;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.behavior.template.OrderRequest</li>
 * <li>Date : 2019-09-10 10:44</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class OrderRequest   {


    @Request(isNull = false,min = 32)
    private String orderNo;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
}
