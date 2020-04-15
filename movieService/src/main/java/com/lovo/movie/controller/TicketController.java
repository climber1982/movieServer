package com.lovo.movie.controller;

import com.lovo.movie.entity.TicketEntity;
import com.lovo.movie.service.ITicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {
    @Autowired
    private ITicketService ticketService;
    @RequestMapping("findAllTicket")
    public List<TicketEntity> findAllTicket(){

    return ticketService.findAllTicket();
    }
}
