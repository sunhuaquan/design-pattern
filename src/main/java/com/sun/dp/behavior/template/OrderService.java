package com.sun.dp.behavior.template;

/**
 * <ul>
 * <li>ProjectName : design-pattern</li>
 * <li>FileName : com.sun.dp.behavior.template.OrderService</li>
 * <li>Date : 2019-09-10 10:36</li>
 * <li>Desc :
 * <p>
 * </ul>
 *
 * @author sunhuaquan
 * @title
 * @since 1.0.0
 */
public class OrderService extends BaseService<OrderRequest> {
    @Override
    public void invoke(OrderRequest request) {


        System.out.println("order add...");
    }
}
