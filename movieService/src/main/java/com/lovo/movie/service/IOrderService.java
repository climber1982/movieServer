package com.lovo.movie.service;

import com.lovo.movie.entity.OrderEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

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

    /**
     * 修改订单状态
     * @param orderNum
     */
    public  void updateOrderBynum(String orderNum,int tag);

    public List<OrderEntity> findAllOrder();
}
