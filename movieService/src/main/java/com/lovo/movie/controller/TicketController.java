package com.lovo.movie.controller;

import com.lovo.movie.entity.OrderEntity;
import com.lovo.movie.entity.TicketEntity;
import com.lovo.movie.service.ITicketService;
import com.netflix.ribbon.proxy.annotation.Http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {
    @Autowired
    private ITicketService ticketService;
    @RequestMapping("findAllTicket")
    public List<TicketEntity> findAllTicket(){

    return ticketService.findAllTicket();
    }

    /**
     * 根据电影票序号查询出电影票对象
     * @param index
     * @return
     */
    @RequestMapping("ticketByIndex/{index}")
    public TicketEntity ticketByIndex(@PathVariable("index") int index){
       return ticketService.getTicketByIndex(index);
    }

    /**
     * 电影票减1
     * @param index
     * @return
     */
    @RequestMapping("updateTicketNum/{index}")
    public String  updateTicketNum(@PathVariable("index") int index){
        ticketService.updateTicketNum(index);
        return "ok";
    }


}
