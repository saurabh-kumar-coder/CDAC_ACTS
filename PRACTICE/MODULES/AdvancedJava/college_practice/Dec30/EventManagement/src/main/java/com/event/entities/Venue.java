package com.event.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="venue")
public class Venue {

	@Id
	@Column(name="venueid")
	Long venueId;
	@Column(name="venuename")
	String venueName;
	@Column(name="venuelocation")
	String venueLocation;
	@Column(name="venuecapacity")
	Long venueCapacity;
	
	@OneToMany(mappedBy = "venue", cascade = CascadeType.ALL)
	Set<Event> events;
	
}
