package com.lovo.movie.service;

import com.lovo.movie.entity.OrderEntity;

public interface IOrderService {
    /**
     * 保存订单
     * @param orderEntity
     */
    public  void savaOrder(OrderEntity orderEntity);

    /**
     * 根据订单编号查询出订单对象
     * @param orderNum
     * @return
     */
    public OrderEntity getOrderEntityByOrderNum(String orderNum);
}
