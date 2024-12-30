package com.ticket.entities;

import java.time.LocalDateTime;

import com.ticket.enums.CategoryEnum;
import com.ticket.enums.StatusEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="ticket", uniqueConstraints = @UniqueConstraint(columnNames = {"phoneNumber"}))

public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ticketid")
	private Long ticketId;
	@Column(name="phonenumber")
	private String phoneNumber;
	@Column(name="category")
	private CategoryEnum category;
	@Column(name="issuedetails")
	private String issueDetails;
	@Column(name="resolutiondetails")
	private String resolutionDetails;
	@Column(name="status")
	private StatusEnum status;
	@Column(name="issuestartdate")
	private LocalDateTime issueStartDate;
	@Column(name="issueresolutiondate")
	private LocalDateTime issueResolutionDate;
}
