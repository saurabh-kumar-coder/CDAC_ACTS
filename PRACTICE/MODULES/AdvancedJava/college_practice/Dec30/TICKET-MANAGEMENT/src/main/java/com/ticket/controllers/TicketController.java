package com.ticket.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticket.dto.TicketDTO;
import com.ticket.dto.TicketStatusDTO;
import com.ticket.exception.PhoneNumberAlreadyExistException;
import com.ticket.exception.TicketWithIdAlreadyExists;
import com.ticket.exception.TicketWithIdDoesnotExistException;
import com.ticket.services.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	@PostMapping
	public ResponseEntity<TicketDTO> createCategory(@RequestBody TicketDTO ticketDTO) throws PhoneNumberAlreadyExistException, TicketWithIdAlreadyExists {
//		ticketService.createTicket(ticketDTO);
//		return ResponseEntity.ok(ticketDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(ticketService.createTicket(ticketDTO));
	}
	
	@PutMapping("/{ticketId}")
	public ResponseEntity<Boolean> updateCategory(@PathVariable("ticketId") Long ticketId, @RequestBody TicketStatusDTO ticketDTO) throws TicketWithIdDoesnotExistException {
		ticketService.updateTicket(ticketId, ticketDTO);
		return ResponseEntity.ok(true);
	}
	
	@GetMapping("/{ticketId}")
	public ResponseEntity<TicketDTO> getTicketById(@PathVariable("ticketId") Long ticketId) throws TicketWithIdDoesnotExistException {
		TicketDTO ticketById = ticketService.getTicketById(ticketId);
		return ResponseEntity.ok(ticketById);
	}
	
	@GetMapping("/open")
	public ResponseEntity<List<TicketDTO>> getTicketByOpenStatus() {
		List<TicketDTO> allOpenTickets = ticketService.getAllOpenTickets();
		return ResponseEntity.ok(allOpenTickets);
	}
	
	@DeleteMapping("/{ticketId}")
	public ResponseEntity<String> deleteTicketById(@PathVariable("ticketId") Long ticketId) throws TicketWithIdDoesnotExistException {
		ticketService.deleteTicketById(ticketId);
		return ResponseEntity.ok("Deleted ticket");
	}
	
	@GetMapping
	public ResponseEntity<List<TicketDTO>> findAllTickets() {
		List<TicketDTO> allTickets = ticketService.getAllTickets();
		return ResponseEntity.ok(allTickets);
	}
}
