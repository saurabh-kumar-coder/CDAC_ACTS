package com.saurabh.pojo;

import java.io.Serializable;

public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5462950939712037882L;
	private String line1;
	private String line2;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String line1, String line2) {
		super();
		this.line1 = line1;
		this.line2 = line2;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + "]";
	}
}
