package com.service.pojos;

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
@Table(name="category")
public class Category {

	@Id
	@Column(name="categoryid")
	private int categoryId;
	
	@Column(name="categoryname")
	private String categoryName;
	
	@Column(name="categorydescription")
	private String categoryDescription;
	
	@Column(name="categoryimageurl")
	private String categoryImageUrl;
	
}
