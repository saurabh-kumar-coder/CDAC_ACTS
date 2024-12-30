package com.ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.entities.Ticket;
import com.ticket.enums.StatusEnum;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
	
	public List<Ticket> findByPhoneNumber(String phoneNumber);
	
	public List<Ticket> findByStatus(StatusEnum status);
}
