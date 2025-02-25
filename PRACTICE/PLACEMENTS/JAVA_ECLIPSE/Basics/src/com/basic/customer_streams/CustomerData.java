package com.basic.customer_streams;

import java.util.ArrayList;
import java.util.List;

public class CustomerData {
	public static List<Customer> getCustomerOrderData() {
		List<Customer> orderData = new ArrayList<>();
		orderData.add(new Customer(101, 50));
		orderData.add(new Customer(102, 20));
		orderData.add(new Customer(103, 10));
		orderData.add(new Customer(101, 20));
		orderData.add(new Customer(102, 10));
		orderData.add(new Customer(103, 30));
		orderData.add(new Customer(101, 30));
		orderData.add(new Customer(101, 50));
		return orderData;
	}
}
