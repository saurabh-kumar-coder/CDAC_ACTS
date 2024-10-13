package com.ecommerce.entities;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PRODUCTS")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long productId;
	
	@Column(name = "product_name")
	private String productName;
	
	@Column(name = "product_description")
	private String productDescription;
	
	@Column(name = "product_price")
	private BigDecimal productPrice;
	
	@Column(name = "stock")
	private Integer stock;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category categoryId;
	
	@Column(name = "image_url", length = 65555)
	private String imageUrl;
	
	@Column(name = "product_created_at")
	private Date productCreatedAt;
}
