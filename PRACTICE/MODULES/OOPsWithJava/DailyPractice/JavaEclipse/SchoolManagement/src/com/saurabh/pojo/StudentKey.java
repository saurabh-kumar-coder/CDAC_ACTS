package com.saurabh.pojo;

import java.util.Objects;

public final class StudentKey {
	private final Integer rollNo;
	private final String division;
	private final String standard;
	public StudentKey(Integer rollNo, String division, String standard) {
		super();
		this.rollNo = rollNo;
		this.division = division;
		this.standard = standard;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public String getDivision() {
		return division;
	}
	public String getStandard() {
		return standard;
	}
	@Override
	public int hashCode() {
		return Objects.hash(division, rollNo, standard);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentKey other = (StudentKey) obj;
		return Objects.equals(division, other.division) && Objects.equals(rollNo, other.rollNo)
				&& Objects.equals(standard, other.standard);
	}
	@Override
	public String toString() {
		return "StudentKey [rollNo=" + rollNo + ", division=" + division + ", standard=" + standard + "]";
	}
	
}