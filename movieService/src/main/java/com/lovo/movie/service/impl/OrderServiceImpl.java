package com.lovo.movie.service.impl;

import com.lovo.movie.dao.IOrderDao;
import com.lovo.movie.dao.ITicketDao;
import com.lovo.movie.entity.OrderEntity;
import com.lovo.movie.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service(value = "orderService")
public class OrderServiceImpl implements IOrderService {
    @Autowired
  private IOrderDao orderDao;
    public void savaOrder(OrderEntity orderEntity) {
        orderDao.save(orderEntity);
    }

    @Override
    public OrderEntity getOrderEntityByOrderNum(String orderNum) {
        return orderDao.getOrderEntityByOrderNum(orderNum);
    }
}
