package com.shopwise.pojos;

public class CartItem {
	private String categoryId;
	private String productId;
	private int price;

	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartItem(String categoryId, String productId, int price) {
		super();
		this.categoryId = categoryId;
		this.productId = productId;
		this.price = price;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
