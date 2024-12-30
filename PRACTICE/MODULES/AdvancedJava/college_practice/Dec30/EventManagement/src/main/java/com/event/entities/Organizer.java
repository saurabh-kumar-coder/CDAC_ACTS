package com.event.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="organizer")
public class Organizer {
	
	@Id
	@Column(name="organizerid")
	Long organizerId;
	@Column(name="organizername")
	String organizerName;
	@Column(name="organizerorganization")
	String organizerOrganization;
	@Column(name="organizerphonenumber")
	String organizerPhoneNumber;
	
	Set<Event> events;
}
