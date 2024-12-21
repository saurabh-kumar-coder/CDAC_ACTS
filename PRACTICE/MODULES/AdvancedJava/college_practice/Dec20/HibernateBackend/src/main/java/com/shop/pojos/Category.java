package com.shop.pojos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	@Id
	@Column(name="categoryId")
	private String categoryId;
	@Column(name="categoryName")
	private String categoryName;
	@Column(name="categoryDescription")
	private String categoryDescription;
	@Column(name="categoryImageUrl")
	private String categoryImageUrl;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(String categoryId, String categoryName, String categoryDescription, String categoryImageUrl) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.categoryImageUrl = categoryImageUrl;
	}
	public Category(String categoryName, String categoryDescription, String categoryImageUrl) {
		super();
		this.categoryName = categoryName;
		this.categoryDescription = categoryDescription;
		this.categoryImageUrl = categoryImageUrl;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public String getCategoryImageUrl() {
		return categoryImageUrl;
	}
	public void setCategoryImageUrl(String categoryImageUrl) {
		this.categoryImageUrl = categoryImageUrl;
	}
	
	
}
