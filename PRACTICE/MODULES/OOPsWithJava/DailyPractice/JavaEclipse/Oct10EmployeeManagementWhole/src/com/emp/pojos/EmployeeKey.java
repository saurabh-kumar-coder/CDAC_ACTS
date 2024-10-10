package com.emp.pojos;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1642429548678078026L;
	private String firstName;
	private String phoneNo;
	public EmployeeKey(String firstName, String phoneNo) {
		super();
		this.firstName = firstName;
		this.phoneNo = phoneNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "EmployeeKey [firstName=" + firstName + ", phoneNo=" + phoneNo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(firstName, phoneNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeKey other = (EmployeeKey) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(phoneNo, other.phoneNo);
	}
	
}
