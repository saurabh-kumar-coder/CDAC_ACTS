package com.ticket.services;

import java.util.List;

import com.ticket.dto.TicketDTO;
import com.ticket.exception.PhoneNumberAlreadyExistException;
import com.ticket.exception.TicketWithIdAlreadyExists;
import com.ticket.exception.TicketWithIdDoesnotExistException;

public interface TicketService {
	
	public TicketDTO createTicket(TicketDTO ticketDTO) throws PhoneNumberAlreadyExistException, TicketWithIdAlreadyExists;
	
	public TicketDTO updateTicket(Long ticketId, TicketDTO ticketDTO) throws TicketWithIdDoesnotExistException;
	
	public TicketDTO getTicketById(Long ticketId) throws TicketWithIdDoesnotExistException;
	
	public List<TicketDTO> getAllOpenTickets();
	
	public Boolean deleteTicketById(Long ticketId) throws TicketWithIdDoesnotExistException;
	
	public List<TicketDTO> getAllTickets();
	
}
