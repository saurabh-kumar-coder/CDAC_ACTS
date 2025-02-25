package com.basic.customer_streams;

public class Customer {
	int customerId;
	int orderAmount;
	public Customer(int customerId, int orderAmount) {
		super();
		this.customerId = customerId;
		this.orderAmount = orderAmount;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	
}
