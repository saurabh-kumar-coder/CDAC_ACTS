package com.ticket.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.TicketMapper;
import com.ticket.dto.TicketDTO;
import com.ticket.entities.Ticket;
import com.ticket.enums.StatusEnum;
import com.ticket.exception.PhoneNumberAlreadyExistException;
import com.ticket.exception.TicketWithIdAlreadyExists;
import com.ticket.exception.TicketWithIdDoesnotExistException;
import com.ticket.repository.TicketRepository;
import com.ticket.services.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	@Override
	public TicketDTO createTicket(TicketDTO ticketDTO) throws PhoneNumberAlreadyExistException, TicketWithIdAlreadyExists {
		Optional<Ticket> findTicketbyId = ticketRepository.findById(ticketDTO.getTicketId());
		if(findTicketbyId.isEmpty()) {
			throw new TicketWithIdAlreadyExists("Ticket With Id Already Exists");
		}
		List<Ticket> phoneNumberAlreadyExist = ticketRepository.findByPhoneNumber(ticketDTO.getPhoneNumber());
		if(!phoneNumberAlreadyExist.isEmpty()) {
			throw new PhoneNumberAlreadyExistException("Phone Number Already Exist Exception");
		}
		Ticket ticket = TicketMapper.TicketDTOToEntity(ticketDTO);
		ticketRepository.save(ticket);
		return ticketDTO;
	}

	@Override
	public TicketDTO updateTicket(Long ticketId, TicketDTO ticketDTO) throws TicketWithIdDoesnotExistException {
		// TODO Auto-generated method stub
		Optional<Ticket> ticketById = ticketRepository.findById(ticketId);
		if(ticketById.isEmpty()) {
			throw new TicketWithIdDoesnotExistException("Ticket With Id Doesnot Exist Exception");
		} 
		Ticket ticket = ticketById.get();
		BeanUtils.copyProperties(ticketDTO, ticket);		
		ticketRepository.save(ticket);
		return ticketDTO;
	}

	@Override
	public TicketDTO getTicketById(Long ticketId) throws TicketWithIdDoesnotExistException {
		// TODO Auto-generated method stub
		Optional<Ticket> ticketById = ticketRepository.findById(ticketId);
		if(ticketById.isEmpty()) {
			throw new TicketWithIdDoesnotExistException("Ticket With Id Doesnot Exist Exception");
		}
		Ticket ticket = ticketById.get();
		TicketDTO ticketDto = new TicketDTO();
		BeanUtils.copyProperties(ticket, ticketDto);
		return ticketDto;
	}

	@Override
	public List<TicketDTO> getAllOpenTickets() {
		// TODO Auto-generated method stub
		List<Ticket> ticketByOpenStatus = ticketRepository.findByStatus(StatusEnum.OPEN);
		List<TicketDTO> ticketDTO = new ArrayList<TicketDTO>();
		for(Ticket tickets : ticketByOpenStatus) {
			TicketDTO ticket = new TicketDTO();
			BeanUtils.copyProperties(tickets, ticket);
			ticketDTO.add(ticket);
		}
		return ticketDTO;
	}

	@Override
	public Boolean deleteTicketById(Long ticketId) throws TicketWithIdDoesnotExistException {
		// TODO Auto-generated method stub
		Optional<Ticket> ticketById = ticketRepository.findById(ticketId);
		if(ticketById.isEmpty()) {
			throw new TicketWithIdDoesnotExistException("Ticket With Id Doesnot Exist Exception");
		}
		ticketRepository.deleteById(ticketId);
		return true;
	}

	@Override
	public List<TicketDTO> getAllTickets() {
		// TODO Auto-generated method stub
		List<Ticket> allTickets = ticketRepository.findAll();
		List<TicketDTO> ticketDTO = new ArrayList<TicketDTO>();
		for(Ticket tickets : allTickets) {
			TicketDTO ticket = new TicketDTO();
			BeanUtils.copyProperties(tickets, ticket);
			ticketDTO.add(ticket);
		}
		return ticketDTO;
	}
	
	

}
