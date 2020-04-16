package com.lovo.movie.dao;

import com.lovo.movie.entity.OrderEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface IOrderDao extends CrudRepository<OrderEntity,String> {

    @Query("from OrderEntity where orderNum=?1")
    public OrderEntity getOrderEntityByOrderNum(String orderNum);
}
