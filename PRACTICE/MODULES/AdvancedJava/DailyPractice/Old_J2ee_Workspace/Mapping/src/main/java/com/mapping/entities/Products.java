package com.mapping.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter@NoArgsConstructor@AllArgsConstructor
@Entity
public class Products {
	@Id
	private String pId;
	private String productName;
	
	@ManyToMany(mappedBy = "products")
	private List<Categories> categories = new ArrayList<>();
}
