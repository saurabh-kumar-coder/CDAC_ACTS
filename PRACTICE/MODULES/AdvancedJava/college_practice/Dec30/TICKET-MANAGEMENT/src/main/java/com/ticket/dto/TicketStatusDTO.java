package com.ticket.dto;

import java.time.LocalDateTime;

import com.ticket.enums.StatusEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketStatusDTO {
	private Long ticketId;
	private String resolutionDetails;
	private StatusEnum status;
	private LocalDateTime issueResolutionDate;
}
