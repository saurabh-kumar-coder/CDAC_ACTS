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
@Table(name = "ORDER_ITEMS")
public class OrderItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_item_id")
	private Long orderItemId;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Orders orderId;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Products productId;
	
	@Column(name = "quantity")
	private Integer quantity;
	
	@Column(name = "price")
	private BigDecimal price;
	
	@Column(name = "created_at")
	private Date createdAt;
}
