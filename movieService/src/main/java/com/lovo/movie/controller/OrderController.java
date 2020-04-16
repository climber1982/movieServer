package com.lovo.movie.controller;

import com.lovo.movie.entity.OrderEntity;
import com.lovo.movie.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
  private IOrderService orderService;

    @RequestMapping("savaOrder")
    public void savaOrder(@RequestBody OrderEntity orderEntity){
        orderService.savaOrder(orderEntity);
    }
    @RequestMapping("OrderEntityByOrderNum/{orderNum}")
    public OrderEntity getOrderEntityByOrderNum(@PathVariable("orderNum") String orderNum){
      return orderService.getOrderEntityByOrderNum(orderNum);
    }
}
