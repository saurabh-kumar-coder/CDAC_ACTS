package com.ticket.services;

import java.util.List;

import com.ticket.dto.TicketDTO;
import com.ticket.exception.PhoneNumberAlreadyExistException;

public interface TicketService {
	
	public TicketDTO createTicket(TicketDTO ticketDTO) throws PhoneNumberAlreadyExistException;
	
	public TicketDTO updateTicket(Long ticketId);
	
	public TicketDTO getTicketById(Long ticketId);
	
	public List<TicketDTO> getAllOpenTickets();
	
	public TicketDTO deleteTicketById(Long ticketId);
	
	public List<TicketDTO> getAllTickets();
	
}
