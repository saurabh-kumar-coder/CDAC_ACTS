package com.event.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
@Table(name = "attendee")
public class Attendee {

	@Id
	@Column(name="attendeeid")
	Long attendeeId;
	@Column(name="attendeename")
	String attendeeName;
	@Column(name="attendeeemail")
	String attendeeEmail;
	@Column(name="attendeephonenumber")
	String attendeePhoneNumber;

	@ManyToMany(mappedBy = "attendees")
	Set<Event> events;
}
