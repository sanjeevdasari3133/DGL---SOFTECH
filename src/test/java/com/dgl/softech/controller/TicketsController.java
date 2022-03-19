package com.dgl.softech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dgl.softech.dao.TicketDao;
import com.dgl.softech.model.Tickets;



@RestController
@RequestMapping("/tickets")
public class TicketsController {
	@Autowired
    private TicketDao dao;
	@PostMapping("/bookTickets")
    public String bookTickets(List<Tickets> tickets) {
    	dao.saveAll(tickets);
    	return"Tickets Booked :" +tickets.size();
    }
	@GetMapping("/getTickets")
	public List<Tickets> getTickets(){
		return(List<Tickets>) dao.findAll(); 
	}
}
