package com.pluralsight.service;

import com.pluralsight.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public java.lang.Object listTickets() {
        return ticketRepository.findAll();
    }

}
