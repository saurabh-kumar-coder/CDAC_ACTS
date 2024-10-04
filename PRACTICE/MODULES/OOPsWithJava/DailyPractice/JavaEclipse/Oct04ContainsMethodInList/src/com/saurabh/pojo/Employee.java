package com.saurabh.pojo;
import java.time.LocalDate;
public class Employee {
	private Integer id;
	private String name;
	private LocalDate doj;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer id, String name, LocalDate doj) {
		super();
		this.id = id;
		this.name = name;
		this.doj = doj;
	}
	public Employee(Integer id) {
		super();
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", doj=" + doj + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee) {
			Employee e = (Employee)obj;
			return this.getId() == e.getId();
		}
		return false;
	}
	
}
