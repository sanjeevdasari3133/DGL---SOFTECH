package com.dgl.softech.dao;

import org.springframework.data.repository.CrudRepository;

import com.dgl.softech.model.Tickets;

public interface TicketDao extends CrudRepository<Tickets, Integer> {

}
