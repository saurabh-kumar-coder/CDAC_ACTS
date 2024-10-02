package com.saurabh.abstractclasses;

import java.util.Date;

import com.saurabh.interfaces.Itemable;

public abstract class Product implements Itemable {
	private int productId;
	private String productName;
	private Date dateOfProductAdded;
	private double productPrice;
	public abstract double calculatePrice();
	public abstract void displayDetails();
	
}
