package com.event.entities;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
@Table(name = "event")
public class Event {

	@Id
	@Column(name = "eventid")
	Long eventId;
	@Column(name = "eventname")
	String eventName;
	@Column(name = "eventdescription")
	String eventDescription;
	@Column(name = "eventdate")
	LocalDateTime eventDate;
	@Column(name = "eventtime")
	String eventTime;
	
	@ManyToOne
	@JoinColumn(name="venueid")
	Venue venue;
	
	@ManyToMany
	@JoinTable(
			name="event_organizers", 
			joinColumns = @JoinColumn(name="eventid"),
			inverseJoinColumns = @JoinColumn(name="organizerid")
			)
	Set<Organizer> organizers;

	@ManyToMany
	@JoinTable(
			name="event_attendees",
			joinColumns = @JoinColumn(name="eventid"),
			inverseJoinColumns = @JoinColumn(name="attendeeId")
			)
	Set<Attendee> attendees;
}
