package com.lovo.movie.service.impl;

import com.lovo.movie.dao.ITicketDao;
import com.lovo.movie.entity.TicketEntity;
import com.lovo.movie.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service(value = "ticketService")
public class TicketServiceImpl implements ITicketService {
    @Autowired
    private ITicketDao ticketDao;

    public List<TicketEntity> findAllTicket() {
        return (List<TicketEntity>) ticketDao.findAll();
    }

    @Transactional(rollbackFor = {Exception.class})
    public void sava(List<TicketEntity> ticketEntityList) {
         ticketDao.saveAll(ticketEntityList);
    }
}
