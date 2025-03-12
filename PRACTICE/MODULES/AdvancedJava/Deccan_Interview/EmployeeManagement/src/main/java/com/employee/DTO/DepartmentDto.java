package com.employee.DTO;

public class DepartmentDto {

	private Long departmentId;
	private String departmentName;
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public DepartmentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepartmentDto(Long departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	public DepartmentDto(String departmentName) {
		super();
		this.departmentName = departmentName;
	}
	
}
