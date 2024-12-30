package com.ticket.serviceImpl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.TicketMapper;
import com.ticket.dto.TicketDTO;
import com.ticket.entities.Ticket;
import com.ticket.exception.PhoneNumberAlreadyExistException;
import com.ticket.repository.TicketRepository;
import com.ticket.services.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public TicketDTO createTicket(TicketDTO ticketDTO) throws PhoneNumberAlreadyExistException {
		List<Ticket> alreadyExist = ticketRepository.findByPhoneNumber(ticketDTO.getPhoneNumber());
		if(!alreadyExist.isEmpty()) {
			throw new PhoneNumberAlreadyExistException("Phone Number Already Exist Exception");
		}
		Ticket ticket = TicketMapper.TicketDTOToEntity(ticketDTO);
		ticketRepository.save(ticket);
		return ticketDTO;
	}

	@Override
	public TicketDTO updateTicket(Long ticketId) {
		// TODO Auto-generated method stub
		Ticket ticket
//		Ticket ticket = TicketMapper.TicketDTOToEntity(ticketDTO);
//		ticketRepository.save(ticket);
		return ticketDTO;
	}

	@Override
	public TicketDTO getTicketById(Long ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TicketDTO> getAllOpenTickets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TicketDTO deleteTicketById(Long ticketId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TicketDTO> getAllTickets() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
