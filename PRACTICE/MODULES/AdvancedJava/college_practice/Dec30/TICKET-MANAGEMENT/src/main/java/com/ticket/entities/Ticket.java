package com.ticket.entities;

import java.time.LocalDateTime;

import com.ticket.enums.CategoryEnum;
import com.ticket.enums.StatusEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Table(name="ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ticketid")
	private Long ticketId;
	@Column(name="phonenumber")
	private String phoneNumber;
	@Enumerated(EnumType.STRING)
	private CategoryEnum category;
	@Column(name="issuedetails")
	private String issueDetails;
	@Column(name="resolutiondetails")
	private String resolutionDetails;
	@Enumerated(EnumType.STRING)
	private StatusEnum status;
	@Column(name="issuestartdate")
	private LocalDateTime issueStartDate;
	@Column(name="issueresolutiondate")
	private LocalDateTime issueResolutionDate;
}

//	, columnDefinition = "default = null")