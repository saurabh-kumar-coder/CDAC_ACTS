package com.mvc.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="categoryid")
	int categoryId;
	
	@Column(name="categoryname")
	String categoryName;
	
	@Column(name="categorydescription")
	String categoryDescription;
	
	@Column(name="categoryimageurl")
	String categoryImageUrl;
	
}
