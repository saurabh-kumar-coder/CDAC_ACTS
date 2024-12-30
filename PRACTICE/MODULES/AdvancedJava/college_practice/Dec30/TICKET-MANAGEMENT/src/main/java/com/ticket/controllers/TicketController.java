package com.ticket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.dto.TicketDTO;
import com.ticket.exception.PhoneNumberAlreadyExistException;
import com.ticket.services.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	@PostMapping
	public ResponseEntity<TicketDTO> createCategory(@RequestBody TicketDTO ticketDTO) throws PhoneNumberAlreadyExistException {
		ticketService.createTicket(ticketDTO);
		return ResponseEntity.ok(ticketDTO);
	}
	
	@PutMapping
	public ResponseEntity<TicketDTO> updateCategory(@RequestBody TicketDTO ticketDTO) {
		ticketService.updateTicket(ticketDTO);
		return ResponseEntity.ok(ticketDTO);
	}
	
}
