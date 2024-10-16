package com.userservice.entity;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USER_TABLE")
public class User {
	@Id
	@Column(name = "USER_ID")
	private String userId;
	@Column(name = "NAME")
	private String name;
	@Column(name = "EMAIL", unique = true)
	private String email;
	@Column(name = "ABOUT")
	private String about;
	@Transient
	private List<Rating> ratings = new ArrayList<>();
}
