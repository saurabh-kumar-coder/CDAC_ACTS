package com.ticket.mapper;

import com.ticket.dto.TicketDTO;
import com.ticket.entities.Ticket;

public class TicketMapper {
	
	public static Ticket TicketDtoToTicketEntity(TicketDTO ticketDTO) {
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
	
	public static TicketDTO TicketEntityToTicketDto(Ticket ticketEntity) {
		TicketDTO ticketDTO = new TicketDTO();
		ticketDTO.setTicketId(ticketEntity.getTicketId());
		ticketDTO.setPhoneNumber(ticketEntity.getPhoneNumber());
		ticketDTO.setCategory(ticketEntity.getCategory());
		ticketDTO.setStatus(ticketEntity.getStatus());		
		ticketDTO.setIssueDetails(ticketEntity.getIssueDetails());
		ticketDTO.setIssueResolutionDate(ticketEntity.getIssueResolutionDate());
		ticketDTO.setIssueStartDate(ticketEntity.getIssueStartDate());
		ticketDTO.setResolutionDetails(ticketEntity.getResolutionDetails());
		System.out.println(ticketDTO);
		return ticketDTO;
	}
	
}
