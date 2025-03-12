package com.basic.dummy_data;

public class Data {
	private int id;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Data(int id, String status) {
		super();
		this.id = id;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Data [id=" + id + ", status=" + status + "]";
	}
	
	
}
