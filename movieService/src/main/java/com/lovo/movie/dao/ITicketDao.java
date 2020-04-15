package com.lovo.movie.dao;

import com.lovo.movie.entity.TicketEntity;
import org.springframework.data.repository.CrudRepository;

public interface ITicketDao extends CrudRepository<TicketEntity,String> {

}
