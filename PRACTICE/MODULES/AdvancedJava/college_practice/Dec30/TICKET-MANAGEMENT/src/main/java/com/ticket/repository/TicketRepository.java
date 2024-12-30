package com.ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
	
	public List<Ticket> findByPhoneNumber(String phoneNumber);
}
