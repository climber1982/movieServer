package com.lovo.movie.service;

import com.lovo.movie.entity.TicketEntity;

import java.util.List;

public interface ITicketService {
    /**
     * 查询出所有的票
     * @return
     */
    public List<TicketEntity> findAllTicket();

    /**
     * 保存
     *
     */
    public  void sava(List<TicketEntity> ticketEntityList);
}
