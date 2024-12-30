package com.ticket;

import com.ticket.dto.TicketDTO;
import com.ticket.entities.Ticket;

public class TicketMapper {
	
	public static Ticket TicketDTOToEntity(TicketDTO ticketDTO) {
		Ticket ticketEntity = new Ticket();
		ticketEntity.setTicketId(ticketDTO.getTicketId());
		ticketEntity.setPhoneNumber(ticketDTO.getPhoneNumber());
		ticketEntity.setCategory(ticketDTO.getCategory());
		ticketEntity.setStatus(ticketDTO.getStatus());		
		ticketEntity.setIssueDetails(ticketDTO.getIssueDetails());
		ticketEntity.setIssueResolutionDate(ticketDTO.getIssueResolutionDate());
		ticketEntity.setIssueStartDate(ticketDTO.getIssueStartDate());
		ticketEntity.setResolutionDetails(ticketDTO.getResolutionDetails());
		System.out.println(ticketEntity);
		return ticketEntity;
	}
	
}
